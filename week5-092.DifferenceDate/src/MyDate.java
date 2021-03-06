public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate date2) {
        if (earlier(date2)){
            int diff = date2.year - this.year;
            if (this.month > date2.month) return diff-1;
            if (this.month == date2.month && this.day > date2.day) return diff - 1;
            return diff;
        }
        int diff = this.year - date2.year;
        if (date2.month > this.month) return diff-1;
        if (date2.month == this.month && date2.day > this.day) return diff - 1;
        return diff;
    }

}
