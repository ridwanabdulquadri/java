package chapter3;

public class HeartRate {
        private String firstName;
        private String lastName;
        private int day;
        private int month;
        private int yearOfBirth;

        public HeartRate(String firstName, String lastName, int yearOfBirth, int day, int month) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.day = day;
            this.month = month;
            this.yearOfBirth = yearOfBirth;
        }

    public HeartRate() {

    }

    public String getFirstName() {

            return firstName;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        public String getLastName() {

            return lastName;
        }

        public void setLastName(String lastName) {

            this.lastName = lastName;
        }
        public int getDay() {

            return day;
        }

        public void setDay(int day) {

            this.day = day;
        }

        public int getMonth() {

            return month;
        }

        public void setMonth(int month) {

            this.month = month;
        }

        public int getYearOfBirth() {

            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {

            this.yearOfBirth = yearOfBirth;
        }
        public int getFormulaMaximumHeartRate(){
            return 220 - getAge();
        }
        public int getAge(){
            return 2023 - 1996;
        }
    }

