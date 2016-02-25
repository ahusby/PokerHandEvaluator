package ahusby.poker

import scala.util.Random

object Main extends App {

  val deck: List[Card] = {
    val spades = AceOfSpades :: (2 to 13).map(Spades(_)).toList
    val hearts = AceOfHearts :: (2 to 13).map(Hearts(_)).toList
    val diamonds = AceOfDiamonds :: (2 to 13).map(Diamonds(_)).toList
    val clubs = AceOfClubs :: (2 to 13).map(Clubs(_)).toList
    val all = spades ::: hearts ::: diamonds ::: clubs
    Random.shuffle(all)
  }


}
