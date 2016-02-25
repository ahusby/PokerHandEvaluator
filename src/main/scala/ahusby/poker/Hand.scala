package ahusby.poker

sealed trait Hand
case class StraightFlush(cards: List[Card])
case class FourOfAKind(cards: List[Card])
case class FullHouse(cards: List[Card])
case class Flush(cards: List[Card])
case class Straight(cards: List[Card])
case class ThreeOfAKind(cards: List[Card])
case class TwoPair(cards: List[Card])
case class OnePair(cards: List[Card])
case class HighCard(cards: List[Card])

class HandIdentifier {

  // Hvilken hånd har vi?
  def identify(cards: List[Card]): Unit = {
    new HighCard(cards.take(5))
  }
}

// Hvilken av to hender er best? Bør være metode i klassen Hand?
class HandComparator {

}