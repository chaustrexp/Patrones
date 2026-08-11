package tienda_juguetes.vista;

public class Formulario_producto extends javax.swing.JFrame {

    public Formulario_producto() {
        initComponents();
        setTitle("Registrar Producto");
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1        = new javax.swing.JPanel();
        jLabel1        = new javax.swing.JLabel();
        jLabel2        = new javax.swing.JLabel();
        jLabel3        = new javax.swing.JLabel();
        txtId          = new javax.swing.JTextField();
        txtNombre      = new javax.swing.JTextField();
        btnRegistrar   = new javax.swing.JButton();
        btnLimpiar     = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        // Panel principal
        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 40, 40));

        // Titulo
        jLabel1.setText("Registrar Producto");
        jLabel1.setForeground(java.awt.Color.WHITE);
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Label Identificacion
        jLabel2.setText("Identificacion:");
        jLabel2.setForeground(java.awt.Color.WHITE);
        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));

        // Label Nombre
        jLabel3.setText("Nombre del juguete:");
        jLabel3.setForeground(java.awt.Color.WHITE);
        jLabel3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));

        // Campo ID
        txtId.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));

        // Campo Nombre
        txtNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));

        // Boton Registrar
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btnRegistrar.setBackground(java.awt.Color.WHITE);
        btnRegistrar.setForeground(new java.awt.Color(63, 81, 181));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        // Boton Limpiar
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btnLimpiar.setBackground(new java.awt.Color(200, 200, 255));
        btnLimpiar.setForeground(new java.awt.Color(40, 40, 120));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        // Layout del panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txtId.getText().trim();
        String nombre = txtNombre.getText().trim();
        
        tienda_juguetes.controlador.controlador.registrarProducto(id, nombre);
        
        // Limpiar los campos si se guardó correctamente
        btnLimpiarActionPerformed(null);
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtId.setText("");
        txtNombre.setText("");
        txtId.requestFocus();
    }

    // Getters para que el controlador pueda leer los campos
    public String getIdProducto() {
        return txtId.getText().trim();
    }

    public String getNombreProducto() {
        return txtNombre.getText().trim();
    }

    // Variables declaration
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration
}
