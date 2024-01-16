package Palace_Projcet

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Menu_Test extends AnyFunSpec with Matchers{
  describe("The GridMaster Simulation") {
    describe("has a menu") {

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {     
        val expectedResult = "Bryan, Bryana, Bryaden, Angel"
        Menu.showPlayerOrder should be(expectedResult)  
      }

      //******* ADVANCE ORDER *******
      it("can advance the player order") {     
        val expectedResult = "Bryan, Angel, Bryden, Bryana"
        Menu.advancePlayerOrder should be(expectedResult)  
      }
      //******* SHOW GAME AREA *******
      it("can show the game area, including the game board, player hand, players hiden guard, and guard ") {

        val expectedResult = "Board: \n"+
        " "+" "+" "+"        "+"[]"+"[]"+"[]"+" "+" "+" "+" "+"\n"+
        " "+" "+" "+"        "+"[]"+"[]"+"[]"+" "+" "+" "+" "+"\n"+
        " "+" "+" "+"       "+"  "+"  "+"  "+" "+" "+" "+" "+"\n"+
        "[]"+"[]"+" "+"     "+"Count"+" "+"           "+"[]"+"[]"+"\n"+
        "[]"+"[]"+" "+"    "+" "+"Pile"+" "+"            "+"[]"+"[]"+"\n"+
        "[]"+"[]"+"     "+"Deck Count"+"  "+"     "+" "+"[]"+"[]"+"\n"+
        " "+" "+" "+"      "+"  "+"  "+"  "+" "+" "+" "+" "+"\n"+
        " "+" "+" "+"     "+"  "+"  "+"  "+" "+" "+" "+" "+"\n"+
        " "+" "+" "+"        "+"[]"+"[]"+"[]"+" "+" "+" "+" "+"\n"+
        " "+" "+" "+"        "+"[]"+"[]"+"[]"+" "+" "+" "+" "+"\n"+
        "Bryan's hand: ---"+"\n"+
        "Guard:---"+"Hidden Guard:[][][]"+"\n"+
        "Angel's hand: ---"+"\n"+
        "Guard:---"+"Hidden Guard:[][][]"+"\n"+
        "Brayden's hand: ---"+"\n"+
        "Guard:---"+"Hidden Guard:[][][]"+"\n"+
        "Bryana's hand: ---"+"\n"+
        "Guard:---"+"Hidden Guard:[][][]"+"\n"
    
        println(expectedResult)
        Menu.showGameArea should be(expectedResult)
      }  
    }
  }}
