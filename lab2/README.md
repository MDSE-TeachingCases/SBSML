# Lab 2 - Concrete Syntax
In this assignment the students have to develop concrete syntaxes for the **Smart Building System Modeling Language (SBSML)**. The metamodel from the [sample solution](../lab1/sample_solution) of [lab 1](../lab1) will be used, so all students start with the same metamodel and there can be no disadvantages for any group that did not design complete or deficient metamodels in [lab 1](../lab1). There are [template projects](./template) which have to be imported into Eclipse by the students that are already fully set up and configured. The full description can be found in the [assignment](./assignment.pdf).

## Xtext
A textual concrete syntax has to be implemented using Xtext. Therefor the students have define a grammar in the [Sbsml.xtext file](./template/sbsml.xtext/src/at/ac/tuwien/big/Sbsml.xtext). Further the students have to provide scoping support by implementing the described scenarios in the [SbsmlScopeProvider.java file](./template/sbsml.xtext/src/at/ac/tuwien/big/scoping/SbsmlScopeProvider.java).

## Sirius
A graphical concrete syntax has to be implemented using Sirius. Therefor the students have to define mappings for both viewpoints in the [sbsml.odesign file](./template/sbsml.design/description/sbsml.odesign) as well as adding creation tools for element creation support for the specified SBSML elements.

## Lecture Videos
### Textual Concrete Syntax
1. [Introduction ⇲](https://youtu.be/nQVhs818dfs)
2. [Xtext ⇲](https://youtu.be/QkGjnVhZVRg)

### Graphical Concrete Syntax
1. [Introduction ⇲](https://youtu.be/DHyMcpzyFeU)
2. [Approaches ⇲](https://youtu.be/Xa6JHqzM6F0)


## Tutorial Videos
### Xtext
[Xtext ⇲](https://www.youtube.com/watch?v=EKpqPX5tcn0&ab_channel=DominikBork)

### Sirius
[Sirius ⇲](https://www.youtube.com/watch?v=R5fCANLQbhY&ab_channel=DominikBork)