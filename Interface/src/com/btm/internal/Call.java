package com.btm.internal;

public interface Call extends Blutooth
{
    void MakeCall();
    void ReceiveCall();
    void EndCall();
    void HoldCall();
    void MuteCall();
    void UnmuteCall();
    void RecordCall();
    void BlockNumber();
    void ViewCallHistory();
}
