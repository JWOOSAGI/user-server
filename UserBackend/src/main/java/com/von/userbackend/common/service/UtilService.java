package com.von.userbackend.common.service;

public interface UtilService {

    int createRandomInteger(int start, int gapBetweenStartAndEnd);
    double createRandomDouble(int start, int gapBetweenStartAndEnd);
    String createRandomName();

    String createRandomTitle();
    String createRandomContent();

    String createRandomCompany();

    String createRandomUserName();
}
