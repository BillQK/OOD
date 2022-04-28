package cs3500.calc;

import java.io.IOException;

public class faillingAppendable implements Appendable {
  @Override
  public Appendable append(CharSequence csq) throws IOException {
    throw new IOException("Fail");
  }

  @Override
  public Appendable append(CharSequence csq, int start, int end) throws IOException {
    throw new IOException("Fail");
  }

  @Override
  public Appendable append(char c) throws IOException {
    throw new IOException("Fail");
  }
}
