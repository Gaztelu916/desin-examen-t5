package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout()); // Simple layout manager

        // Add a label
        JLabel label = new JLabel("Welcome to My App!");
        frame.add(label);

        // Add a button
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
        frame.add(button);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
}