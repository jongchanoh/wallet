package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPurchased extends AbstractEvent {

    private Long id;

    public CouponPurchased(Coupon aggregate){
        super(aggregate);
    }
    public CouponPurchased(){
        super();
    }
}
