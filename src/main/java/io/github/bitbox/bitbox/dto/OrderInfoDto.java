package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.OrderStatusEnum;
import io.github.bitbox.bitbox.enums.ProductOrderStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
     domain : payment, order, consumer, coupon, product
     detail : 주문정보를 담고 있는 DTO
     method :
     comment : 결제 QR을 만들기 위해서 payment가 먼저 요청을 받고 redis에 받은 정보들을 저장해둔다. 그리고 approve시점에 해당 Dto를 카프카로 전송한다
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfoDto {
    private UserPointUpdateDto userPointUpdateDto; // 포인트
    private UserCouponUpdateDto userCouponUpdateDto; // 쿠폰
    private List<ProductUpdateDto> productUpdateDto; // 재고
    private OrderCreationDto orderCreationDto; // 주문정보(결제 포함)

    public ConsumerOrderListResponseDto createFakeOrder(){
        List<ProductInfo> productInfoList = new ArrayList<>();
        for(ProductInfoDto productInfoDto : orderCreationDto.getProductInfoDtoList()){
            productInfoList.add(
              ProductInfo.builder()
                      .productOrderId(-1L)
                      .productId(productInfoDto.getProductId())
                      .productName(productInfoDto.getProductName())
                      .productCount(productInfoDto.getProductCount())
                      .productPrice(productInfoDto.getProductPrice())
                      .productTotalAmount(productInfoDto.getProductCount()*productInfoDto.getProductPrice())
                      .productOrderStatus(ProductOrderStatusEnum.CANCEL)
                      .productThumbnailImageUrl(productInfoDto.getProductImg())
          .build());
        }

        long point = Optional.ofNullable(userPointUpdateDto.getPoint()).orElse(0L);
        long couponAmount = Optional.ofNullable(userCouponUpdateDto.getTotalAmount()).orElse(0L);
        long totalPrice = orderCreationDto.getTotalPrice();

        return ConsumerOrderListResponseDto.builder()
                .order(OrderInfo.builder().ordersId(orderCreationDto.getOrderId())
                        .orderDate(orderCreationDto.getOrderDate())
                        .orderStatus(OrderStatusEnum.CANCEL)
                        .isAuction(false)
            .build())
                .product(productInfoList)
                .payment(PaymentInfo.builder()
                        .minusPointAmount(point)
                        .minusCouponAmount(couponAmount)
                        .totalPrice(totalPrice)
                        .couponCode(userCouponUpdateDto.getCouponCode())
                        .realPrice(totalPrice - point - couponAmount)
            .build())
                .delivery(DeliveryInfo.builder()
                        .recipientName(orderCreationDto.getRecipientName())
                        .recipientPhoneNumber(orderCreationDto.getRecipientPhoneNumber())
                        .basicAddress(orderCreationDto.getBasicAddress())
                        .addressDetail(orderCreationDto.getAddressDetail())
                        .zonecode(orderCreationDto.getZoneCode())
            .build())


        .build();
    }
}
