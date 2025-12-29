package PP;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test1 {
	
	@Test
	public static void m1() {
	System.out.println("Method 1");
	}
	
	@Test
	public static void m2() {
		System.out.println("Method 1");
		}
	@Test
	public static void m3() {
		System.out.println("Method 1");
		}

}
