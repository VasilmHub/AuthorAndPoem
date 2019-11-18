package zad_07upr;

public class Author {
    private String name;
    private String country;
    private String number;

    public Author(String name, String country, String number) {
        this.name = name;
        this.country = country;
        this.setNumber(number);
    }

    public void setNumber(String number) {
        String[] arr=number.split("-");
        StringBuilder sb=new StringBuilder();
        if(checkNumber(arr)) {
            this.number = number;
        }else {
            for (int i = 0; i <number.length() ; i++) {
                if(Character.isDigit(number.charAt(i))){
                    sb.append(Character.isDigit(number.charAt(i)));
                    if(checkNumber(sb.toString().split("-"))){
                       this.number=number;
                    }
                }
            }
            if(checkNumber(sb.toString().split("-"))){
                this.number=number;
            }
        }
    }

    private boolean checkNumber(String[] arr) {
        return checkFirst(arr) || checkSecond(arr)
        || CheckLast(arr);
    }

    private boolean checkSecond(String[] arr) {
        return arr.length==1&&arr[0].length()==10&&checkDigits(arr[0]);
    }

    private boolean checkFirst(String[] arr) {
        return arr.length==3&&arr[0].length()==3&&checkDigits(arr[0])&&arr[1].length()==3&&checkDigits(arr[1])
        &&arr[2].length()==4&&checkDigits(arr[2]);
    }

    private boolean CheckLast(String[] arr) {
        return arr.length==2&&arr[0].length()==9&&arr[0].charAt(0)=='('
                &&Character.isDigit(arr[0].charAt(1))&&Character.isDigit(arr[0].charAt(2))&&Character.isDigit(arr[0].charAt(3))
                &&Character.isDigit(arr[0].charAt(6))&&Character.isDigit(arr[0].charAt(7))&&Character.isDigit(arr[0].charAt(8))
                &&arr[0].charAt(4)==')'&&arr[0].charAt(5)==' '&&arr[1].length()==4&&checkDigits(arr[1]);
    }

    private boolean checkDigits(String s) {
        for (int i = 0; i <s.length() ; i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public String getNumber() {
        return this.number;
    }
}
