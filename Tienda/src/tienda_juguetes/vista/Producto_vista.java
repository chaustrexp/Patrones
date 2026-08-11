package tienda_juguetes.vista;

public class Producto_vista extends javax.swing.JFrame {

    public Producto_vista() {
        initComponents();
        setTitle("Gestion Tienda Juguetes");
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        // Panel principal
        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 40, 40));

        // Titulo principal
        jLabel1.setText("Tienda de Juguetes");
        jLabel1.setForeground(java.awt.Color.WHITE);
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 26));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Subtitulo
        jLabel2.setText("Selecciona una opcion");
        jLabel2.setForeground(new java.awt.Color(200, 200, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Boton Registrar Producto
        btnRegistrar.setText("Registrar Producto");
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(63, 81, 181));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 20, 12, 20));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        // Boton Ver Productos
        btnVerProductos.setText("Ver Productos");
        btnVerProductos.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnVerProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnVerProductos.setForeground(new java.awt.Color(63, 81, 181));
        btnVerProductos.setFocusPainted(false);
        btnVerProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 20, 12, 20));
        btnVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });

        // Layout del panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(btnVerProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20)
            .addComponent(btnVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Formulario_producto formulario = new Formulario_producto();
        formulario.setVisible(true);
    }

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {
        Lista_producto lista = new Lista_producto();
        lista.setVisible(true);
    }

    // Variables declaration
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
