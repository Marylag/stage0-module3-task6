package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float fractionalPart  = numberToBeRounded - (int) numberToBeRounded;

        int roundedNumber;
        if (fractionalPart >= 0.5) {
            roundedNumber = (int) numberToBeRounded + 1;
        } else {
            roundedNumber = (int) numberToBeRounded;
        }

        System.out.print(roundedNumber + "\n");
    }

    public static void main(String[] args) {
        FloatTypeCasting rounder = new FloatTypeCasting ();
        rounder.roundNumber(19.4F);
        rounder.roundNumber(19.5F);
    }
}
