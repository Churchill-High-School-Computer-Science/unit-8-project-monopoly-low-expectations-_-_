import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cards {

    public enum CardType {
        MOVE,           
        MOVE_NEAREST,   
        PAY,            
        RECEIVE,        
        GET_OUT_OF_JAIL,
        GO_TO_JAIL,     
        BACKWARD,       
        REPAIRS,        
        PAY_EVERYONE    
    }

    public static class Card {
        @SuppressWarnings("FieldMayBeFinal")
        private String message;
        @SuppressWarnings("FieldMayBeFinal")
        private CardType type;
        @SuppressWarnings("FieldMayBeFinal")
        private int amount;
        @SuppressWarnings("FieldMayBeFinal")
        private String targetLocation;
        @SuppressWarnings("FieldMayBeFinal")
        private String propertyType;

        public Card(String message, CardType type, int amount, String targetLocation, String propertyType) {
            this.message = message;
            this.type = type;
            this.amount = amount;
            this.targetLocation = targetLocation;
            this.propertyType = propertyType;
        }

        public String getMessage() {
            return message;
        }

        public CardType getType() {
            return type;
        }

        public int getAmount() {
            return amount;
        }

        public String getTargetLocation() {
            return targetLocation;
        }

        public String getPropertyType() {
            return propertyType;
        }
    }

    public static class CardDatabase {
        private static final Map<String, Card> chanceCards = new HashMap<>();
        private static final Map<String, Card> communityChestCards = new HashMap<>();

        static {
            chanceCards.put("CH1", new Card("Advance to Boardwalk", CardType.MOVE, 0, "Boardwalk", null));
            chanceCards.put("CH2", new Card("Advance to Go (Collect $200)", CardType.MOVE, 200, "GO", null));
            chanceCards.put("CH3", new Card("Advance to Illinois Avenue. If you pass Go, collect $200.", CardType.MOVE, 200, "Illinois Avenue", null));
            chanceCards.put("CH4", new Card("Advance to St. Charles Place. If you pass Go, collect $200.", CardType.MOVE, 200, "St. Charles Place", null));
            chanceCards.put("CH5", new Card("Advance to the nearest Railroad", CardType.MOVE_NEAREST, 0, null, "Railroad"));
            chanceCards.put("CH6", new Card("Advance to the nearest Railroad", CardType.MOVE_NEAREST, 0, null, "Railroad"));
            chanceCards.put("CH7", new Card("Advance token to nearest Utility", CardType.MOVE_NEAREST, 0, null, "Utility"));
            chanceCards.put("CH8", new Card("Bank pays you dividend of $50", CardType.RECEIVE, 50, null, null));
            chanceCards.put("CH9", new Card("Get Out of Jail Free", CardType.GET_OUT_OF_JAIL, 0, null, null));
            chanceCards.put("CH10", new Card("Go Back 3 Spaces", CardType.BACKWARD, 3, null, null));
            chanceCards.put("CH11", new Card("Go to Jail. Do not pass Go, do not collect $200.", CardType.GO_TO_JAIL, 0, null, null));
            chanceCards.put("CH12", new Card("Make general repairs on all your property. Pay $40 per house, $115 per hotel.", CardType.REPAIRS, 0, null, null));
            chanceCards.put("CH13", new Card("Speeding fine $15.", CardType.PAY, 15, null, null));
            chanceCards.put("CH14", new Card("Take a trip to Reading Railroad. If you pass Go, collect $200.", CardType.MOVE, 200, "Reading Railroad", null));
            chanceCards.put("CH15", new Card("You have been elected Chairman of the Board. Pay each player $50.", CardType.PAY_EVERYONE, 50, null, null));
            chanceCards.put("CH16", new Card("Your building loan matures. Collect $150.", CardType.RECEIVE, 150, null, null));

            communityChestCards.put("CC1", new Card("Advance to Go (Collect $200)", CardType.MOVE, 200, "GO", null));
            communityChestCards.put("CC2", new Card("Bank error in your favor. Collect $200.", CardType.RECEIVE, 200, null, null));
            communityChestCards.put("CC3", new Card("Doctor’s fee. Pay $50.", CardType.PAY, 50, null, null));
            communityChestCards.put("CC4", new Card("From sale of stock you get $50.", CardType.RECEIVE, 50, null, null));
            communityChestCards.put("CC5", new Card("Get Out of Jail Free", CardType.GET_OUT_OF_JAIL, 0, null, null));
            communityChestCards.put("CC6", new Card("Go to Jail. Do not pass Go, do not collect $200.", CardType.GO_TO_JAIL, 0, null, null));
            communityChestCards.put("CC7", new Card("Holiday fund matures. Receive $100.", CardType.RECEIVE, 100, null, null));
            communityChestCards.put("CC8", new Card("Income tax refund. Collect $20.", CardType.RECEIVE, 20, null, null));
            communityChestCards.put("CC9", new Card("It is your birthday. Collect $10 from every player.", CardType.PAY_EVERYONE, 10, null, null));
            communityChestCards.put("CC10", new Card("Life insurance matures. Collect $100.", CardType.RECEIVE, 100, null, null));
            communityChestCards.put("CC11", new Card("Pay hospital fees of $100.", CardType.PAY, 100, null, null));
            communityChestCards.put("CC12", new Card("Pay school fees of $50.", CardType.PAY, 50, null, null));
            communityChestCards.put("CC13", new Card("Receive $25 consultancy fee.", CardType.RECEIVE, 25, null, null));
            communityChestCards.put("CC14", new Card("You are assessed for street repair. Pay $40 per house, $115 per hotel.", CardType.REPAIRS, 0, null, null));
            communityChestCards.put("CC15", new Card("You have won second prize in a beauty contest. Collect $10.", CardType.RECEIVE, 10, null, null));
            communityChestCards.put("CC16", new Card("You inherit $100.", CardType.RECEIVE, 100, null, null));
        }

        public static Map<String, Card> getChanceCards() {
            return chanceCards;
        }

        public static Map<String, Card> getCommunityChestCards() {
            return communityChestCards;
        }
    }

    public static Card drawRandomChanceCard() {
        ArrayList<Card> cards = new ArrayList<>(CardDatabase.getChanceCards().values());
        Collections.shuffle(cards);
        return cards.get(0);
    }

    public static Card drawRandomCommunityChestCard() {
        ArrayList<Card> cards = new ArrayList<>(CardDatabase.getCommunityChestCards().values());
        Collections.shuffle(cards);
        return cards.get(0);
    }
}
