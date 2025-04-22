package com.btm.internal;

public interface Blutooth extends  MobileShop
{
    void EnableBluetooth();
    void DisableBluetooth();
    void PairBluetoothDevice();
    void UnpairBluetoothDevice();
    void SearchBluetoothDevices();
    void ShowPairedDevices();
    void SendFileViaBluetooth();
    void ReceiveFileViaBluetooth();
    void BluetoothStatus();
}
