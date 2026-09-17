# Implementation Plan - Navigate between screens with Compose

This plan outlines the steps to complete the "Navigate between screens with Compose" codelab for the Cupcake app.

## Proposed Changes

### Navigation Setup

#### [MODIFY] [CupcakeScreen.kt](file:///D:/basic-android-kotlin-compose-training-cupcake-starter/app/src/main/java/com/example/cupcake/CupcakeScreen.kt)
- Define `CupcakeScreen` enum with route names and title resource IDs.
- Update `CupcakeAppBar` to dynamically display the title and show/hide the back button based on the navigation state.
- Implement `CupcakeApp` with `NavController` and `NavHost`.
- Define navigation routes for Start, Flavor, Pickup, and Summary screens.
- Implement `cancelOrderAndNavigateToStart` helper function.

### Screen Callback Updates

#### [MODIFY] [StartOrderScreen.kt](file:///D:/basic-android-kotlin-compose-training-cupcake-starter/app/src/main/java/com/example/cupcake/ui/StartOrderScreen.kt)
- Add `onNextButtonClicked: (Int) -> Unit` parameter.
- Pass the callback to `SelectQuantityButton`.

#### [MODIFY] [SelectOptionScreen.kt](file:///D:/basic-android-kotlin-compose-training-cupcake-starter/app/src/main/java/com/example/cupcake/ui/SelectOptionScreen.kt)
- Add `onCancelButtonClicked: () -> Unit` and `onNextButtonClicked: () -> Unit` parameters.
- Wire these callbacks to the Cancel and Next buttons.

#### [MODIFY] [SummaryScreen.kt](file:///D:/basic-android-kotlin-compose-training-cupcake-starter/app/src/main/java/com/example/cupcake/ui/SummaryScreen.kt)
- Add `onCancelButtonClicked: () -> Unit` and `onSendButtonClicked: (String, String) -> Unit` parameters.
- Wire these callbacks to the Cancel and Send buttons.
- `onSendButtonClicked` will pass the subject and order summary.

### Intent Implementation

- In `CupcakeApp`, implement the `shareOrder` logic using an implicit `ACTION_SEND` intent.

## Verification Plan

### Automated Tests
- Run existing unit tests to ensure no regressions in `OrderViewModel`.
- (Optional) Implement navigation tests if mentioned in the codelab.

### Manual Verification
1.  **Start Screen**: Select a quantity, verify navigation to Flavor screen.
2.  **Flavor Screen**: Select a flavor, verify "Next" button enables, verify navigation to Pickup screen.
3.  **Pickup Screen**: Select a date, verify "Next" button enables, verify navigation to Summary screen.
4.  **Summary Screen**: Verify order details are correct.
5.  **Back Navigation**: Click the Up button in the TopAppBar from any screen (except Start) and verify it returns to the previous screen.
6.  **Cancel Order**: Click "Cancel" on any screen and verify it returns to the Start screen with reset state.
7.  **Share Order**: Click "Send Order to Another App" and verify the Android Sharesheet opens with the correct text.
