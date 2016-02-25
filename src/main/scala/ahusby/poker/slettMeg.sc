import ahusby.poker._

val deck: List[Card] = {
  val spades = AceOfSpades :: (2 to 13).map(Spades(_)).toList
  val hearts = AceOfHearts :: (2 to 13).map(Hearts(_)).toList
  val diamonds = AceOfDiamonds :: (2 to 13).map(Diamonds(_)).toList
  val clubs = AceOfClubs :: (2 to 13).map(Clubs(_)).toList
  spades ::: hearts ::: diamonds ::: clubs
}

deck.foreach{
  case c: Ace => printAces(c)
  case c: NonAce => printNonAces(c)
}
def printAces(c: Ace): Unit = c match {
    case c: SpadesSuit => println(c)
    case c: HeartsSuit => println(c)
    case c: DiamondsSuit => println(c)
    case c: ClubsSuit => println(c)
}
def printNonAces(c: NonAce): Unit = c match {
  case c: SpadesSuit => println(c)
  case c: HeartsSuit => println(c)
  case c: DiamondsSuit => println(c)
  case c: ClubsSuit => println(c)
}