package io.restall.jrecover.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectStreamConstants;

/**
 *
 */
public class RecoveryInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {

  public Object readObject() throws ClassNotFoundException, IOException {
    //TODO
    return null;
  }

  public void readFully(byte[] b) throws IOException {
    //TODO
  }

  public void readFully(byte[] b, int off, int len) throws IOException {
    //TODO
  }

  public int skipBytes(int n) throws IOException {
    //TODO
    return 0;
  }

  public boolean readBoolean() throws IOException {
    //TODO
    return false;
  }

  public byte readByte() throws IOException {
    //TODO
    return 0;
  }

  public int readUnsignedByte() throws IOException {
    //TODO
    return 0;
  }

  public short readShort() throws IOException {
    //TODO
    return 0;
  }

  public int readUnsignedShort() throws IOException {
    //TODO
    return 0;
  }

  public char readChar() throws IOException {
    //TODO
    return 0;
  }

  public int readInt() throws IOException {
    //TODO
    return 0;
  }

  public long readLong() throws IOException {
    //TODO
    return 0;
  }

  public float readFloat() throws IOException {
    //TODO
    return 0;
  }

  public double readDouble() throws IOException {
    //TODO
    return 0;
  }

  public String readLine() throws IOException {
    //TODO
    return null;
  }

  public String readUTF() throws IOException {
    //TODO
    return null;
  }

  @Override
  public int read() throws IOException {
    //TODO
    return 0;
  }
}
