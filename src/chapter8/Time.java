package chapter8;

    public class Time {
        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public static void validate(int hour, int minute, int second) {
            validateHour(hour);
            validateMinute(minute);
            validateSecond(second);
        }

        public static void validateHour(int hour) {
            boolean hourIsInvalid = hour < 0 || hour >= 24;

            if (hourIsInvalid) {
                throw new IllegalArgumentException("Hour is not valid");
            }
        }

        public static void validateMinute(int minute) {
            boolean minutesIsInvalid = minute < 0 || minute >= 24;

            if (minutesIsInvalid) {
                throw new IllegalArgumentException("Minute is not valid");
            }
        }

        public static void validateSecond(int second) {
            boolean secondIsInvalid = second < 0 || second >= 24;

            if (secondIsInvalid) {
                throw new IllegalArgumentException("Second is not valid");
            }
    }

}
