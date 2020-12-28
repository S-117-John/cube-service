package com.cube.core.domain.model;

import java.util.Date;

/**
 * 领域事件接口
 */
public interface DomainEvent {

    Date occurredOn();
}
