/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/orvito/vivek backup/HVLogin/WalkyTalky/src/com/webeclubbin/mynpr/IStreamingMediaPlayer.aidl
 */
package com.webeclubbin.mynpr;
// Interface for Streaming Player.

public interface IStreamingMediaPlayer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.webeclubbin.mynpr.IStreamingMediaPlayer
{
private static final java.lang.String DESCRIPTOR = "com.webeclubbin.mynpr.IStreamingMediaPlayer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.webeclubbin.mynpr.IStreamingMediaPlayer interface,
 * generating a proxy if needed.
 */
public static com.webeclubbin.mynpr.IStreamingMediaPlayer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.webeclubbin.mynpr.IStreamingMediaPlayer))) {
return ((com.webeclubbin.mynpr.IStreamingMediaPlayer)iin);
}
return new com.webeclubbin.mynpr.IStreamingMediaPlayer.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getStation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getStation();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUrl:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getUrl();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_playing:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.playing();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startAudio:
{
data.enforceInterface(DESCRIPTOR);
this.startAudio();
reply.writeNoException();
return true;
}
case TRANSACTION_stopAudio:
{
data.enforceInterface(DESCRIPTOR);
this.stopAudio();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.webeclubbin.mynpr.IStreamingMediaPlayer
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
// Returns Currently Station Name

public java.lang.String getStation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStation, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Returns Currently Playing audio url

public java.lang.String getUrl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUrl, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Check to see if service is playing audio

public boolean playing() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_playing, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//Start playing audio

public void startAudio() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startAudio, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//Stop playing audio

public void stopAudio() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopAudio, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getStation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getUrl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_playing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
// Returns Currently Station Name

public java.lang.String getStation() throws android.os.RemoteException;
// Returns Currently Playing audio url

public java.lang.String getUrl() throws android.os.RemoteException;
// Check to see if service is playing audio

public boolean playing() throws android.os.RemoteException;
//Start playing audio

public void startAudio() throws android.os.RemoteException;
//Stop playing audio

public void stopAudio() throws android.os.RemoteException;
}
