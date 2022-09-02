package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PickupCanceled extends AbstractEvent {

    private Long id;
    private String returnMethod;
    private String status;

// keep

}


