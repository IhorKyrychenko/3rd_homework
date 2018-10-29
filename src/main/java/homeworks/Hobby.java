package homeworks;

public class Hobby {
    private byte favouriteHobby;
    private short numberOfHobbies;
    private char letter;
    private int age;
    private long normNamesEnds;
    private float currentHrivnyaValue;
    private double currentBitcoinValue;
    private boolean areYouLike;

    Hobby(Hobby object){
        object.favouriteHobby = favouriteHobby;
        object.numberOfHobbies = numberOfHobbies;
        object.letter = letter;
        object.age = age;
        object.normNamesEnds = normNamesEnds;
        object.currentHrivnyaValue = currentHrivnyaValue;
        object.currentBitcoinValue = currentBitcoinValue;
        object.areYouLike = areYouLike;
    }

    Hobby(){
        this.favouriteHobby = favouriteHobby;
        this.numberOfHobbies = this.numberOfHobbies;
        this.letter = letter;
        this.age = age;
        this.normNamesEnds = normNamesEnds;
        this.currentHrivnyaValue = currentHrivnyaValue;
        this.currentBitcoinValue = currentBitcoinValue;
        this.areYouLike = areYouLike;
    }

    Hobby(byte a, short b, char c, int d, long e, float f, double g, boolean h){
        a = favouriteHobby;
        b = numberOfHobbies;
        c = letter;
        d = age;
        e = normNamesEnds;
        f = currentHrivnyaValue;
        g = currentBitcoinValue;
        h = areYouLike;
    }

    public byte getFavouriteHobby() {
            return favouriteHobby;
        }

    public void setFavouriteHobby(byte favouriteHobby) {
        this.favouriteHobby = favouriteHobby;
    }

    public short getNumberOfHobbies() {
            return numberOfHobbies;
        }

    public void setNumberOfHobbies(short numberOfHobbies) {
            this.numberOfHobbies = numberOfHobbies;
        }

    public char getLetter() {
            return letter;
        }

    public void setLetter(char letter) {
            this.letter = letter;
        }

    public int getAge() {
            return age;
        }

    public void setAge(int age) {
            this.age = age;
        }

    public long getNormNamesEnds() {
            return normNamesEnds;
        }

    public void setNormNamesEnds(long normNamesEnds) {
            this.normNamesEnds = normNamesEnds;
        }

    public float getCurrentHrivnyaValue() {
            return currentHrivnyaValue;
        }

    public void setCurrentHrivnyaValue(float currentHrivnyaValue) {
        this.currentHrivnyaValue = currentHrivnyaValue;
    }

    public double getCurrentBitcoinValue() {
            return currentBitcoinValue;
        }

    public void setCurrentBitcoinValue(double currentBitcoinValue) {
        this.currentBitcoinValue = currentBitcoinValue;
    }

    public boolean isAreYouLike() {
            return areYouLike;
        }

    public void setAreYouLike(boolean areYouLike) {
            this.areYouLike = areYouLike;
        }

    public void tellAboutHobby(){
        System.out.println("Your age is " + getAge());
        System.out.println("Your favourite letter is " + getLetter());
        System.out.println("The number of your hobbies " + getNumberOfHobbies());
        System.out.println("Your favourite hobby is " + getFavouriteHobby());
        System.out.println("The number of hours I was thinking how to name this field is " + getNormNamesEnds());
        System.out.println("The current Hrivnya value is " + getCurrentHrivnyaValue());
        System.out.println("The current Bitcoin value is " + getCurrentBitcoinValue());
        System.out.println("And you answer is " + isAreYouLike());
    }
}