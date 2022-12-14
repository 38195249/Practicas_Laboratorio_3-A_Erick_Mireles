package mx.edu.elextra.extraeval.ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import mx.edu.elextra.extraeval.acciones.Procesos;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
	public Ventana(){
		initComponents();
		setJMenuBar(mb);
		mb.add(mnFile);
		mnFile.add(miOpen);
		mnFile.addSeparator();
		mnFile.add(miSalir);
		mb.add(mnSort);
		mnSort.add(miMarca);
		mnSort.add(miCosto);
		add(lbMarca);
		add(txMarca);
		add(lbCosto);
		add(txCosto);
		add(lbRam);
		add(lbPrc);
		add(txRam);
		add(txPrc);
		add(btnPrev);
		add(lbIdx);
		add(btnNext);
		add(lbTipoOrd);
	}
	private void initComponents(){
		// Establecer el el tipo de JFrame como un FlowLayout
        setLayout(new FlowLayout());
		// Establecer el cierre de la aplicación al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Crear la Barra de Menú mb
		mb = new JMenuBar();
		// Crear el Menú mnFile "Archivo"
		mnFile = new JMenu("Archivo");
		// Crear el Menú Item miOpen "Abrir"
		miOpen = new JMenuItem("Abrir");
		// Agregar al miOpen la clase anónima que manda llamar a los métodos siguientes: 
				// Procesos.openFile();
				// Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
		miOpen.addActionListener(new ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent e) {
			procesos.openFile();
			procesos.getPrev(txMarca, txCosto, txRam, txPrc, lbIdx);
			}
		});
		//
		// Crear el Menú Item miOpen "Salir"
		miSalir = new JMenuItem("Salir");
		// Agregar al miOpen la clase anónima que manda llamar al método siguientes:
		miSalir.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				dispose();
				}
			});
		// Crear el menú mnSort "Ordenar por ..."
		mnSort = new JMenu("Ordenar por ...");
		// Crear el Menú Item miMarca "Marca"
		miMarca = new JMenuItem("Marca");
		// Crear el Menú Item miCosto "Costo"
			miCosto = new JMenuItem("Costo");
		// Crear la etiqueta lbMarca "Marca"
		lbMarca = new JLabel("Marca");
		// Crear la etiqueta lbMarca "Costo"
		lbCosto = new JLabel("Costo");
		// Crear la etiqueta lbRamP "Ram/Proc"
		lbRam = new JLabel("Ram");
		lbPrc = new JLabel("Proc");
		// Crear el campo de texto txMarca de tamaño 20
		txMarca = new JTextField(20);
		// Crear el campo de texto txCosto de tamaño 20
		txCosto = new JTextField(20);
		// Crear el campo de texto txRamP de tamaño 20
		txRam = new JTextField(20);
		txPrc = new JTextField(20);

		// Crear el botón btnPrev " <- "
		btnPrev = new JButton(" <- ");
		// Crear el botón btnNext " -> "
		btnNext = new JButton(" -> ");
		// Crear la etiqueta lbIdx "0/0"
		lbIdx = new JLabel("0/0");
		
		String espacios = "       ";
		// Crear la etiqueta Label ordenando lbTipoOrd espacios+"Tipo de Ordenamiento"+espacios
		lbTipoOrd = new JLabel(espacios+"Tipo de Ordenamiento"+espacios);
		
		// Agregar al btnPrev la clase anónima que manda llamar al método siguientes:
			// Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
		btnPrev.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				procesos.getPrev(txMarca, txCosto, txRam, txPrc, lbIdx);
				}
			});

		// Agregar al btnNext la clase anónima que manda llamar al método siguientes:
				// Procesos.getNext(txMarca, txCosto, txRamP, lbIdx);
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				procesos.getNext(txMarca, txCosto, txRam, txPrc, lbIdx);
				}
			});

		// Agregar al miMarca la clase anónima que manda llamar a los métodos siguientes: 
		miMarca.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				lbTipoOrd.setText(espacios+"Ordenados por Marca"+espacios);
				procesos.sortMarca();
				}
			});

		// Agregar al miCosto la clase anónima que manda llamar a los métodos siguientes: 
		miCosto.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				lbTipoOrd.setText(espacios+"Ordenados por Costo"+espacios);
				procesos.sortCosto();
			}
		});
		setSize(330,350);
	}
	JMenuBar mb;
	JMenu mnFile,mnSort;
	JMenuItem miOpen, miSalir, miMarca, miCosto;
	JLabel lbMarca, lbModelo, lbCosto, lbRam, lbPrc, lbTipoOrd, lbIdx;
	JTextField txMarca, txCosto, txRam, txPrc;
	JButton btnPrev, btnNext;
	Procesos procesos;
}
