package com.btm.internal;

public interface ChargerSocket extends Call

{
    void PlugInCharger();
    void UnplugCharger();
    void Compatibility();
    void TestChargingPort();
    void ReplaceChargingSocket();
    void CleanChargingPort();
    void DetectCharging();
    void ShowChargingStatus();
    void EnableFastCharging();
}
