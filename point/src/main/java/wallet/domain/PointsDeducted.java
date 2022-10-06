package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PointsDeducted extends AbstractEvent {

    private Long id;

    public PointsDeducted(Point aggregate){
        super(aggregate);
    }
    public PointsDeducted(){
        super();
    }
}
