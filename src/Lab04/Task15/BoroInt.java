package Lab04.Task15;

public class BoroInt {
    private String val;

    public BoroInt(){
        this.val = "0";
    }

    public BoroInt(String val) {
        String trimmedVal = trim(val);
        if(validValue(trimmedVal)){
            this.val = trimmedVal;
        }else {
            System.err.println("Non Number Exception");
        }
    }

    public BoroInt(int number){
        this.val = String.valueOf(number);
    }

    public BoroInt(BoroInt boroInt){
        this.val = boroInt.getVal();
    }

    public BoroInt add(BoroInt boroInt){
        String resVal = "", boroVal = this.val, chotoVal = boroInt.getVal();
        if(this.val.length() < boroInt.getVal().length()){
            boroVal = boroInt.getVal();
            chotoVal = this.val;
        }

        int carry = 0, chotoValIndex = chotoVal.length() - 1;

        for(int i = boroVal.length() - 1; i >= 0; i--){
            int top = Integer.parseInt(boroVal.charAt(i) + "");
            if(chotoValIndex < 0){
                if((top + carry) != 10) {
                    resVal = resVal.concat((top + carry) % 10 + "");
                }else {
                    resVal = resVal.concat((top + carry) % 10 + "");
                }
                carry = (top+carry) / 10;
            }else {
                int bottom = Integer.parseInt(chotoVal.charAt(chotoValIndex--) + "");
                int sum = top + bottom + carry;
                if (sum >= 10) {
                    carry = sum / 10;
                }
                resVal = resVal.concat(sum%10 + "");
            }
        }

        resVal = resVal.concat(carry + "");
        char[] resVal_chars = resVal.toCharArray();
        char[] reversedCharArray = new char[resVal_chars.length];
        int j = 0;
        for(int i = resVal_chars.length - 1; i >= 0; i--){
            reversedCharArray[j++] = resVal_chars[i];
        }

        return new BoroInt(new String(reversedCharArray));
    }

    public BoroInt subtract(BoroInt boroInt){
        String resVal = "", boroVal = this.val, chotoVal = boroInt.getVal();

        if(this.val.length() < boroInt.getVal().length()){
            boroVal = boroInt.getVal();
            chotoVal = this.val;
        }else if (this.val.length() == boroInt.getVal().length()){
            if (Integer.parseInt(this.val.charAt(0) + "") < Integer.parseInt(boroInt.getVal().charAt(0) + "")){
                boroVal = boroInt.getVal();
                chotoVal = this.val;
            }
        }
        System.out.println(boroVal + ", " + chotoVal);

        int carry = 0, chotoValIndex = chotoVal.length() - 1;

        for(int i = boroVal.length() - 1; i >= 0; i--){
            int top = Integer.parseInt(boroVal.charAt(i) + "");
            if(chotoValIndex < 0){
                resVal = resVal.concat((top%10 - carry)  + "");
                carry = top / 10;
            }else {
                int bottom = Integer.parseInt(chotoVal.charAt(chotoValIndex--) + "");
                if(top < bottom+carry){
                    top = top + 10;
                    //System.out.println(top);
                }

                int sub = top - (bottom + carry);
                //System.out.println(sub);
                carry = top / 10;

                resVal = resVal.concat(sub + "");
            }
        }

        char[] resVal_chars = resVal.toCharArray();
        char[] reversedCharArray = new char[resVal_chars.length];
        int j = 0;
        for(int i = resVal_chars.length - 1; i >= 0; i--){
            reversedCharArray[j++] = resVal_chars[i];
        }

        return new BoroInt(new String(reversedCharArray));
    }

    private boolean validValue(String val) {
        int startPoint = 0;
        if(val.codePointAt(0) == 43 || val.codePointAt(0) == 45){
            startPoint = 1;
        }

        for(int i = startPoint;  i < val.length(); i++){
            if(!(val.codePointAt(i) >= 48 && val.codePointAt(i) <= 57)){
                return false;
            }
        }

        return true;
    }

    private String trim(String string){
        int[] digits = new int[string.length()];
        int size = 0;
        for(int i = 0; i < digits.length; i++){
            if(string.codePointAt(i) != 32){
                digits[i] = string.charAt(i);
                size++;
            }
        }

        char[] trimmedArray = new char[size];

        int index = 0;
        for (int i = 0; i < digits.length; i++){
            if(digits[i] != 0){
                trimmedArray[index++] = (char)digits[i];
            }
        }

        return new String(trimmedArray);
    }



    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = trim(val);
    }
}
