package winPrototype;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import win.User;

import javax.swing.UIManager;
import java.awt.BorderLayout;

public class TrendsWindow {

	private JFrame trendsFrame;
	private JTable dayTable;
	private User user1 = new User(123, "Ana", "female", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		displayTrendsWindow();
	}

	/**
	 * Create the application.
	 */
	public TrendsWindow() {
		initialize();
	}
	
	public static void displayTrendsWindow(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrendsWindow window = new TrendsWindow();
					window.trendsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		trendsFrame = new JFrame();
		trendsFrame.setBounds(100, 100, 295, 475);
		trendsFrame.getContentPane().setBackground(SystemColor.textHighlight);
		trendsFrame.getContentPane().setLayout(null);
		//trendsFrame.getContentPane().setLayout(null);
		
		dayTable = new JTable();
		dayTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sleep Time", null},
				{"Workout Time", null},
				{"Steps", null},
			},
			new String[] {
				"Data", "Value"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		dayTable.setBackground(SystemColor.textHighlight);
		dayTable.setBounds(43, 111, 174, 226);
		trendsFrame.getContentPane().add(dayTable);
		
		trendsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	 // added rows from arraylist to jtable
    public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) dayTable.getModel();
        Vector<Integer> rowData= new Vector<Integer>();
        for(int i = 0; i < user1.dailyTrends.size(); i++)
        {
            rowData.add(user1.dailyTrends.get(i).getSleepTime());
            rowData.add(user1.dailyTrends.get(i).getWorkoutTime());
            rowData.add(user1.dailyTrends.get(i).getNumSteps());
            model.addRow(rowData);
        }
                
    }
}
