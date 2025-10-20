package homework1;

public class Homework1_3 {
	public static void main(String[] args) {
		final int SECONDS_PER_MINUTE = 60;
		final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;
		final int SECONDS_PER_DAY = SECONDS_PER_HOUR * 24;
		int totalSeconds = 256559;
		int days = totalSeconds / SECONDS_PER_DAY;
		int remainingAfterDays = totalSeconds % SECONDS_PER_DAY;
		int hours = remainingAfterDays / SECONDS_PER_HOUR;
		int remainingAfterHours = remainingAfterDays % SECONDS_PER_HOUR;
		int minutes = remainingAfterHours / SECONDS_PER_MINUTE;
		int seconds = remainingAfterHours % SECONDS_PER_MINUTE;
		System.out.println(totalSeconds+"是"+days+"天"+hours+"小時"+minutes+"分"+seconds+"秒");
	}
}
