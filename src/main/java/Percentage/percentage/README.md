The percentage package operates as a unified suite of tools designed to process budget data. The workflow is activated by the Runner class and starts with the Loader class, which acts as the data entry tool. It utilizes the Apache Commons CSV library to parse the liga2025.csv file. Specifically, the tool looks for headers named "Κωδικός", "Ονομασία", and "Ποσό". As it reads each line, it applies a sanitization filter to the "Ποσό" column using the replace() string methods to strip dots and adjust commas. This ensures that the raw text from the CSV is converted into a clean BigDecimal format that the rest of the application can handle.

The calculation logic is isolated in the Calculator class. This tool uses Java Streams to aggregate data. When a calculation is triggered, the class takes two lists of numbers and uses the reduce operation to find their sums. It then performs the division and multiplication by 100 in a single pipeline. To prevent the application from crashing, the calculator includes a validation check: it compares the divisor (Sum B) to BigDecimal.ZERO before proceeding. If it detects a zero, it throws an ArithmeticException, which the UI then catches to display a warning to the user.

The user interaction is managed through a split logic between GUI1 and GUI2.

Data Visualization: The csvDisplayArea uses a TextArea component to render the entire budget file. We used UTF-8 encoding and StandardCharsets to ensure Greek characters are displayed correctly.

Input Controls: The interface provides two TextField components for entering budget codes. To make the interaction faster, we implemented Keyboard Events via setOnKeyPressed. If a user presses ENTER while inside a field, the calculation starts automatically, while ESC clears the current inputs.

History & Feedback: Every successful calculation is stored in an ObservableList and displayed in a ListView on the right side of the screen. This allows the user to keep track of multiple comparisons without taking notes.

Contextual Tools: We added a ContextMenu to the main text area. By right-clicking, the user can quickly navigate or copy information, making the exploration of the large CSV file much easier.

For the test process, we used JUnit for automated checks. When mvn test is executed, the Surefire Plugin runs our test suite, which verifies that the safeNumber tool correctly formats the input and that the Calculator produces the expected percentages. This ensures that all components of the package work together seamlessly before the application is deployed.