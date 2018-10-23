package com.cc.decorator;

import java.io.*;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 8:57
 * @Description DecoratorIOTest
 */
public class DecoratorIOTest {
	public static void main(String[] args) {
		try {
			String workDir = System.getProperty("user.dir");
			InputStream inputStream = new LowCaseInputStream(new BufferedInputStream(new FileInputStream(workDir + "\\src\\main\\java\\com\\cc\\decorator\\test.txt")));
			int c;
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class LowCaseInputStream extends FilterInputStream {
		public LowCaseInputStream(InputStream inputStream) {
			super(inputStream);
		}

		public int read() throws IOException {
			int c = super.read();
			return (c == -1) ? c : Character.toLowerCase(c);
		}

		public int read(byte[] b, int offset, int len) throws IOException {
			int result = super.read(b, offset, len);
			for (int i = 0; i < result; i++) {
				b[i] = (byte)Character.toLowerCase((char)b[i]);
			}
			return result;
		}
	}
}
