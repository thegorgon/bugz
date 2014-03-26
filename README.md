# bugz

A Fun Clojure Game With Battling Bugs

## Running

    $ java -jar bugz-0.1.0-standalone.jar [args]

## The Game

Your goal is to define a strategy for bugs in your colony that best serves the colony. Each bug can see 2 tiles in every direction. At each step, the bug can do only one thing and must decide which thing it should do. 

Tiles have the following properties:
* Sugar content: `(:sugar tile)`
* Another bug: `(:bug tile)`
* Scent strength: `(:scent tile)`. Note that every team has a separate scent.

Bugs can take the following actions:
* Move in any direction if the square is empty: `move-nw`, `move-ne`, `move-e`, `move-se`, `move-s` `move-sw`, `move-w`
* Harvest sugar if there is sugar in an adjacent square: `havest-sugar`
* Deposit sugar in an adjacent square: `deposit-sugar-nw`, `deposit-sugar-ne`, `deposit-sugar-e`, `deposit-sugar-se`, `deposit-sugar-s` `deposit-sugar-sw`, `deposit-sugar-w`

## Defining Strategies

To define a strategy, define a function that takes the bug and it's visible surroundings as arguments and returns the action that the bug should take. e.g.

    (defn strategy [ant area]
      ;; analyze the world and decide what to do, in this case move northwest
      move-nw)

## License

Distributed under the [MIT License](http://opensource.org/licenses/MIT)
