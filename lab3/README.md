# Lab 3 - Model2Model Transformation
In this assignment the students have to develop model-to-model transformations for the **Smart Building System Modeling Language (SBSML)**. The metamodel from the [lab 1 sample solution](../lab1) will be used, so all students start with the same metamodel and there can be no disadvantages for any group that did not design complete or deficient metamodels in [lab 1](../lab1). There are [template projects](./template) which have to be imported into Eclipse by the students that are already fully set up and configured. The full description can be found in the [assignment](./assignment.pdf) as well as the [sample solution](./sample_solution).

## ATL
The students have to provide an out-place transformation using ATL where SBSML conform models have to be transformed to AutomationML/CAEX conform models following the specification in the [assignment](./assignment.pdf). Therefor the students have to implement ATL rules in the [sbsml2caex.atl file](./template/sbsml.atl/sbsml2caex.atl). The [output folder](./template/sbsml.atl/output) contains the expected transformation results, which can be used for comparison.

### Vidoes
  - [ATL Tutorial ⇲](https://www.youtube.com/watch?v=Ti45EXFrcjY&ab_channel=DominikBork)


## Henshin
The students have to provide multiple in-place transformations using Henshin to fix corrupted SBSML modles following described scenarios in the [assignment](./assignment.pdf). Therefor the students have to implement the already defined Henshin rules in the [sbsml.henshin file](./template/sbsml.henshin/henshin/sbsml.henshin). The [model folder](./template/sbsml.henshin/model) contains the expected transformation results, which can be used for comparison.

### Videos
1. [Introduction ⇲](https://youtu.be/tnfvuOwwB1U)
2. [Graph Transformations ⇲](https://youtu.be/wm0OG7Cc44k)
3. [Henshin Tutorial ⇲](https://www.youtube.com/watch?v=pvCpeuZKii8&ab_channel=DominikBork)