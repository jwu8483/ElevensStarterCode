package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;


    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param rank  a <code>String</code> value
     *                  containing the rank of the card
     * @param suit  a <code>String</code> value
     *                  containing the suit of the card
     * @param pointValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }


    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        return suit;

    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        return pointValue;

    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {
        if (suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue == otherCard.pointValue)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
    return rank + " of " + suit + " point value =" + pointValue + "+";
    }
}

