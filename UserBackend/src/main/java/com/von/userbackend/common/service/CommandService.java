package com.von.userbackend.common.service;

import com.von.userbackend.common.component.MessengerVO;

public interface CommandService<T> {
      MessengerVO save(T t);
      MessengerVO deleteById(Long id);
      MessengerVO modify(T t);
}