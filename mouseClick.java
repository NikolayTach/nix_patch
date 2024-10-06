// Assume 'component' is a Button object in your GUI.
Button button = new Button("Click me!");

button.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        MouseEvent clickedEvent = createClicked(button, 10, 20);
        // Process the clicked event here...
    }
});
