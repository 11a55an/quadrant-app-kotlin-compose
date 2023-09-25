# Compose Quadrant - Solution Code

This repository contains the solution code for the Compose Quadrant practice problem. In this exercise, we build an app that displays information about the Composable functions you've learned.

## New Modifiers/Properties

The following is an overview of the Modifiers/Properties not covered in the Codelabs but used to solve the problem.

- **fontWeight**: This parameter in Text composable allows you to specify how bold or light the text content should appear. FontWeight.Bold is used to set the font style to bold.

- **textAlign**: This parameter in Text composable defines how to align the text horizontally. The TextAlign.Justify property stretches the lines of text that end with a soft line break to fill the width of the container.

- **Modifier.weight**: This modifier is scoped to the Row composable. It allows the element's width to be proportional to its weight and relative to other weighted sibling elements. The parent will divide the horizontal space remaining after measuring unweighted child elements and distribute it according to this weight.

## Solution

Following is an overview of the steps used in the solution:

1. For a single quadrant, create a `ComposableInforCard`.

    ```kotlin
    // Setup background, padding and size modifiers. Also, set the alignment to center - vertically as well as horizontally
    Column(...) {
        // Title text
        Text(...)
        // Description text
        Text(...)
    }
    ```

2. Create a Row composable to align two cards horizontally. Set the weight to 1f so that the space is distributed equally.

    ```kotlin
    Row(Modifier.weight(1f)){
        // Quadrant to be displayed on the first half of the screen
        ComposableInforCard(...)
        // Quadrant to be displayed on the second half of the screen
        ComposableInforCard(...)
    }
    ```

3. Create another Row composable with the same structure as above to display the remaining two quadrants.

    ```kotlin
    Row(Modifier.weight(1f)){
        // Quadrant to be displayed on the first half of the screen
        ComposableInforCard(...)
        // Quadrant to be displayed on the second half of the screen
        ComposableInforCard(...)
    }
    ```

4. Wrap both the Row composables in a Column composable to align them vertically.

    ```kotlin
    Column(...){
        // First row, which displays info on Text and Image composable functions
        Row(Modifier.weight(1f)) {
            ...
        }
        // Second row, which displays info on Row and Column composable functions
        Row(Modifier.weight(1f)) {
            ...
        }
    }
    ```

**Note:**

The solution code uses the basic composables covered in Unit 1, Pathway 3 for Android Basics in Compose:

- Build a simple app with text composables.
- Add images to your Android app.
