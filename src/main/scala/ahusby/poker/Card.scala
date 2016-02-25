package ahusby.poker

sealed trait Suit
//case object Spades extends Suit
//case object Hearts extends Suit
//case object Diamonds extends Suit
//case object Clubs extends Suit
trait SpadesSuit extends Suit
trait HeartsSuit extends Suit
trait DiamondsSuit extends Suit
trait ClubsSuit extends Suit

sealed trait Card
trait NonAce extends Card
trait Ace extends Card

//trait Suited {
//  type S <: Suit
//  val suite: S
//}

//trait NonAce extends Card with Suited {
//  val value: Int
//}
//trait Ace extends Card with Suited
//
//case class SpadesCard(value: Int) extends NonAce {
//  override type S = Spades.type
//  override val suite = Spades
//}

case class Spades(value: Int) extends NonAce with SpadesSuit
case class Hearts(value: Int) extends NonAce with HeartsSuit
case class Diamonds(value: Int) extends NonAce with DiamondsSuit
case class Clubs(value: Int) extends NonAce with ClubsSuit
case object AceOfSpades extends Ace with SpadesSuit
case object AceOfHearts extends Ace with HeartsSuit
case object AceOfDiamonds extends Ace with DiamondsSuit
case object AceOfClubs extends Ace with ClubsSuit

