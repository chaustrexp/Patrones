package tienda_juguetes.vista;

public class Lista_producto extends javax.swing.JFrame {

    public Lista_producto() {
        initComponents();
        setTitle("Lista de Productos");
        setLocationRelativeTo(null);
        tienda_juguetes.controlador.controlador.cargarProductosEnTabla(getTableModel());
    }

    private void initComponents() {

        jPanel1      = new javax.swing.JPanel();
        jLabel1      = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1      = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        // Panel principal
        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Titulo
        jLabel1.setText("Lista de Productos");
        jLabel1.setForeground(java.awt.Color.WHITE);
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Tabla — sin filas hardcodeadas, se llenará desde el controlador
        jTable1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        jTable1.setRowHeight(28);
        jTable1.setBackground(java.awt.Color.WHITE);
        jTable1.setForeground(new java.awt.Color(30, 30, 30));
        jTable1.setGridColor(new java.awt.Color(200, 200, 200));
        jTable1.setSelectionBackground(new java.awt.Color(63, 81, 181));
        jTable1.setSelectionForeground(java.awt.Color.WHITE);
        jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        jTable1.getTableHeader().setBackground(new java.awt.Color(40, 53, 147));
        jTable1.getTableHeader().setForeground(java.awt.Color.WHITE);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] { "Identificacion", "Nombre Producto" }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // tabla de solo lectura
            }
        });
        jScrollPane1.setViewportView(jTable1);

        // Layout del panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        // Layout del frame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Metodo para que el controlador pueda cargar los datos en la tabla
    public javax.swing.table.DefaultTableModel getTableModel() {
        return (javax.swing.table.DefaultTableModel) jTable1.getModel();
    }

    // Variables declaration
    private javax.swing.JLabel      jLabel1;
    private javax.swing.JPanel      jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable      jTable1;
    // End of variables declaration
}
