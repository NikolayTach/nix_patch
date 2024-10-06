// Assume 'component' is a Button object in your GUI.
Button button = new Button("Click me!");

button.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        CustomMouseEvent clickedEvent = new CustomMouseEvent(button, 
System.currentTimeMillis(), 10, 20, MouseEvent.MOUSE_CLICKED, false);
        // Process the clicked event here...
    }
});

// Another way to create a custom mouse event
CustomMouseEvent anotherClickedEvent = new CustomMouseEvent(button, 
System.currentTimeMillis(), 30, 40, MouseEvent.MOUSE_CLICKED, false, 15, 25);
