object HigherOrderOperators extends App {

    val words = List("We", "are", "Scala", "!")
    val oneToFile = List(1, 2, 3, 4, 5)
    val minusFiveToFive = List(-5, -4, -3, -2, 1, 0, 1, 2, 3, 4, 5)
    val zeroList = List(0, 0, 0, 0, 0)
    var value = 0

    // map
    val m = words map (_.toList)
    println(m) // List(List(W, e), List(a, r, e), List(S, c, a, l, a), List(!))

    // flatMap
    val fMap = words flatMap (_.toList)
    println(fMap) // List(W, e, a, r, e, S, c, a, l, a, !)

    // foreach
    oneToFile foreach (value += _)
    println(value) // 15

    // filter
    val fil = oneToFile filter (_ % 2 == 0)
    println(fil) // List(2, 4)

    // partition
    val par = oneToFile partition (_ % 2 == 0)
    println(par) // (List(2, 4),List(1, 3, 5))

    // find
    val fin = oneToFile find (_ % 2 == 0)
    println(fin) // Some(2)

    // takeWhile
    val tWhile = minusFiveToFive takeWhile (_ < 0)
    println(tWhile) // List(-5, -4, -3, -2)

    // dropWhile
    val dWhile = minusFiveToFive dropWhile (_ < 0)
    println(dWhile) // List(1, 0, 1, 2, 3, 4, 5)

    // span
    val spa = minusFiveToFive span (_ < 0)
    println(spa) // (List(-5, -4, -3, -2),List(1, 0, 1, 2, 3, 4, 5))

    // forall
    val fAll = List(0, 0, 0, 0, 0) forall (_ == 0)
    println(fAll) // true

    // exists
    val exi = List(1, 1, 0, 1, 1) exists (_ == 0)
    println(exi) // true

    // foldLeft
    val fLeft = oneToFile.foldLeft(0)((x, y) => x + y)
    println(fLeft) // 15

    // :\ (fold right)
    val fRight = oneToFile.foldRight(0)((x, y) => x + y)
    println(fRight) // 15

    // sortWith
    val sWith = words sortWith (_.length > _.length)
    println(sWith) // List(Scala, are, We, !)
}


// ============================================
//              Output Sample
// ============================================
// $ scalac HigherOrderOperators.scala
// $ scala HigherOrderOperators
// List(List(W, e), List(a, r, e), List(S, c, a, l, a), List(!))
// List(W, e, a, r, e, S, c, a, l, a, !)
// 15
// List(2, 4)
// (List(2, 4),List(1, 3, 5))
// Some(2)
// List(-5, -4, -3, -2)
// List(1, 0, 1, 2, 3, 4, 5)
// (List(-5, -4, -3, -2),List(1, 0, 1, 2, 3, 4, 5))
// true
// true
// 15
// 15
// List(Scala, are, We, !)
