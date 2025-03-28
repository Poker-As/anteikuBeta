package GUI.empleado;

import DAO.clienteDAO;
import DAO.empleadoDAO;
import DAO.usuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clasesDeObjetos.cliente;
import clasesDeObjetos.empleado;
import clasesDeObjetos.usuario;
import com.mycompany.cafeteria.Threads.ThreadCliente;
import java.awt.event.KeyEvent;
import logica.LlenarTablas;
import logica.ValidarCamposDeTexto;
import logica.ValidarCorreo;
import logica.hashPassword;

public class homeEmpleado extends javax.swing.JFrame {

    usuarioDAO uDao = new usuarioDAO();
    clienteDAO cDao = new clienteDAO();
    empleadoDAO eDao = new empleadoDAO();
    
    ValidarCamposDeTexto v = new ValidarCamposDeTexto();
    ValidarCorreo validarCorreo = new ValidarCorreo();

    LlenarTablas llenarTabla = new LlenarTablas();
    
    private long contCliente;
    
    public homeEmpleado() {
        initComponents();  
        llenarTablaClientesInicio();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        actualizarLblContadorCliente();
    }
    
    private void actualizarLblContadorCliente(){
        Thread hilo = new Thread(new ThreadCliente(cDao, contClientes));
        hilo.start();
    }
    
    public void llenarTablaClientesInicio(){
    
       clienteDAO cDao = new clienteDAO();
        
       DefaultTableModel model = (DefaultTableModel) JtablaClienteInicio.getModel();
       model.setRowCount(0);
        
       List<cliente> listaClientes = cDao.listar();
       
       for(cliente c : listaClientes){
           model.addRow(new Object[]{
               c.getCedulaUsuario(),
               c.getNombreUsuario(),
               c.getApellidoUsuario(),
               c.getCorreoUsuario()
           });
       }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenu = new javax.swing.JPopupMenu();
        jPanel16 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        Jtabbed = new javax.swing.JTabbedPane();
        panelInfoIncio = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaProductos = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtablaClienteInicio = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        contClientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelInfoClientes = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jdcFechaNacimientoCliente = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cbGeneroCliente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnInsertarCliente = new javax.swing.JButton();
        btnMostrarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaCliente = new javax.swing.JTable();
        panelEmpleado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtCedulaEmpleado = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        cbJornadaEmpleado = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        cbContratoEmpleado = new javax.swing.JComboBox<>();
        jdcFechaNacimientoEmpleado = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jdcFechaIngresoEmpleado = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        cbGeneroEmpleado = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnInsertarEmpleado = new javax.swing.JButton();
        btnMostrarEmpleado = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        btnModificarEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        txtBuscarEmpleado = new javax.swing.JTextField();
        btnBuscarObtener = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaEmpleado = new javax.swing.JTable();
        panelInfoVentas = new javax.swing.JPanel();
        panelInfoProductos = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelCategoria = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        idc = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        nombrec = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        panelUsusario = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 34, 34));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 204, 46));
        jLabel1.setText("COFFE ANTEIKU");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        jPanel1.setBackground(new java.awt.Color(238, 207, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1320, 50));

        panelMenu.setBackground(new java.awt.Color(34, 34, 34));
        panelMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelMenuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblInicio.setText("Inicio");
        lblInicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblInicioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });
        lblInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblInicioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCliente.setText("Cliente");
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEmpleado.setText("Empleado");
        lblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 220, 810));

        Jtabbed.setBackground(new java.awt.Color(34, 34, 34));
        Jtabbed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtabbedMouseClicked(evt);
            }
        });

        panelInfoIncio.setBackground(new java.awt.Color(243, 229, 215));

        jPanel11.setBackground(new java.awt.Color(58, 53, 53));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel12.setBackground(new java.awt.Color(34, 34, 34));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Productos");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtablaProductos.setBackground(new java.awt.Color(34, 34, 34));
        JtablaProductos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JtablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        JtablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtablaProductos.setFocusable(false);
        JtablaProductos.setRowHeight(25);
        JtablaProductos.setSelectionBackground(new java.awt.Color(34, 34, 34));
        JtablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JtablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JtablaProductos);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(58, 53, 53));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 204, 46)));

        jPanel14.setBackground(new java.awt.Color(34, 34, 34));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ultimos Clientes Registrados");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtablaClienteInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Correo"
            }
        ));
        jScrollPane2.setViewportView(JtablaClienteInicio);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        jPanel24.setBackground(new java.awt.Color(72, 59, 59));

        jPanel25.setBackground(new java.awt.Color(34, 34, 34));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        contClientes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        contClientes.setForeground(new java.awt.Color(255, 255, 255));
        contClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contClientes.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clientes");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(contClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(contClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoIncioLayout = new javax.swing.GroupLayout(panelInfoIncio);
        panelInfoIncio.setLayout(panelInfoIncioLayout);
        panelInfoIncioLayout.setHorizontalGroup(
            panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoIncioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoIncioLayout.createSequentialGroup()
                        .addContainerGap(1013, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoIncioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoIncioLayout.setVerticalGroup(
            panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        Jtabbed.addTab("tab1", panelInfoIncio);

        panelInfoClientes.setBackground(new java.awt.Color(243, 229, 215));

        jPanel7.setBackground(new java.awt.Color(59, 47, 47));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 229, 215));
        jLabel12.setText("Cedula");

        txtCedulaCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCedulaCliente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedulaCliente.setForeground(new java.awt.Color(59, 47, 47));
        txtCedulaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaClienteActionPerformed(evt);
            }
        });
        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 229, 215));
        jLabel8.setText("Nombre");

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(59, 47, 47));
        txtNombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 229, 215));
        jLabel9.setText("Apellido");

        txtApellidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoCliente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellidoCliente.setForeground(new java.awt.Color(59, 47, 47));
        txtApellidoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 229, 215));
        jLabel11.setText("Telefono");

        txtTelefonoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoCliente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefonoCliente.setForeground(new java.awt.Color(59, 47, 47));
        txtTelefonoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 229, 215));
        jLabel7.setText("Fecha nacimiento");

        jdcFechaNacimientoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimientoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimientoCliente.setForeground(new java.awt.Color(59, 47, 47));
        jdcFechaNacimientoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 229, 215));
        jLabel13.setText("Genero");

        cbGeneroCliente.setBackground(new java.awt.Color(243, 229, 215));
        cbGeneroCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbGeneroCliente.setForeground(new java.awt.Color(59, 47, 47));
        cbGeneroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 229, 215));
        jLabel10.setText("Correo");

        txtCorreoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoCliente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel45.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(250, 204, 46));
        jLabel45.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel44)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8)
                                        .addComponent(txtApellidoCliente)
                                        .addComponent(txtNombreCliente)
                                        .addComponent(txtCedulaCliente)
                                        .addComponent(txtTelefonoCliente)
                                        .addComponent(jdcFechaNacimientoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbGeneroCliente, 0, 240, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 182, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaNacimientoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(59, 47, 47));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jButton1.setBackground(new java.awt.Color(250, 204, 46));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(59, 47, 47));
        jButton1.setText("BORRAR CAMPOS DE TEXTO");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(59, 47, 47));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR POR NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(59, 47, 47))); // NOI18N

        btnInsertarCliente.setBackground(new java.awt.Color(250, 204, 46));
        btnInsertarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertarCliente.setForeground(new java.awt.Color(59, 47, 47));
        btnInsertarCliente.setText("INSERTAR");
        btnInsertarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarClienteActionPerformed(evt);
            }
        });

        btnMostrarCliente.setBackground(new java.awt.Color(250, 204, 46));
        btnMostrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMostrarCliente.setForeground(new java.awt.Color(59, 47, 47));
        btnMostrarCliente.setText("MOSTRAR");
        btnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setBackground(new java.awt.Color(250, 204, 46));
        btnModificarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(59, 47, 47));
        btnModificarCliente.setText("MODIFICAR");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(250, 204, 46));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(59, 47, 47));
        jButton9.setText("ELIMINAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR POR ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(59, 47, 47))); // NOI18N
        txtBuscarCliente.setCaretColor(new java.awt.Color(0, 0, 0));

        btnBuscarCliente.setBackground(new java.awt.Color(250, 204, 46));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(59, 47, 47));
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 184, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnMostrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(59, 47, 47));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTROS DE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jtablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        jtablaCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono", "Fecha nacimiento", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtablaCliente);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoClientesLayout = new javax.swing.GroupLayout(panelInfoClientes);
        panelInfoClientes.setLayout(panelInfoClientesLayout);
        panelInfoClientesLayout.setHorizontalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoClientesLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelInfoClientesLayout.setVerticalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );

        Jtabbed.addTab("tab2", panelInfoClientes);

        panelEmpleado.setBackground(new java.awt.Color(243, 229, 215));

        jPanel2.setBackground(new java.awt.Color(59, 47, 47));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        txtNombreEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        txtNombreEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombreEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(243, 229, 215));
        jLabel39.setText("Cedula");

        txtCedulaEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        txtCedulaEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedulaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtCedulaEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(243, 229, 215));
        jLabel36.setText("Apellido");

        txtApellidoEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        txtApellidoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellidoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(243, 229, 215));
        jLabel38.setText("Telefono");

        txtTelefonoEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        txtTelefonoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefonoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(243, 229, 215));
        jLabel37.setText("Correo");

        txtCorreoEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        txtCorreoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(243, 229, 215));
        jLabel43.setText("Jornada");

        cbJornadaEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        cbJornadaEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbJornadaEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        cbJornadaEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mañana", "Tarde", "Noche", "Mixta", " " }));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(243, 229, 215));
        jLabel42.setText("Tipo contrato");

        cbContratoEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        cbContratoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbContratoEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        cbContratoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Trabajo", "Prestacion de servicios" }));
        cbContratoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContratoEmpleadoActionPerformed(evt);
            }
        });

        jdcFechaNacimientoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimientoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimientoEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(243, 229, 215));
        jLabel41.setText("Fecha ingreso");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(243, 229, 215));
        jLabel34.setText("Fecha nacimiento");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(243, 229, 215));
        jLabel40.setText("Genero");

        cbGeneroEmpleado.setBackground(new java.awt.Color(243, 229, 215));
        cbGeneroEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbGeneroEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        cbGeneroEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hombre", "Mujer" }));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(243, 229, 215));
        jLabel35.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)
                    .addComponent(txtCorreoEmpleado)
                    .addComponent(cbJornadaEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbContratoEmpleado, 0, 260, Short.MAX_VALUE)
                    .addComponent(jdcFechaNacimientoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcFechaIngresoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefonoEmpleado)
                    .addComponent(txtApellidoEmpleado)
                    .addComponent(txtNombreEmpleado)
                    .addComponent(txtCedulaEmpleado))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbGeneroEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGeneroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJornadaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbContratoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jPanel5.setBackground(new java.awt.Color(59, 47, 47));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        btnInsertarEmpleado.setBackground(new java.awt.Color(250, 204, 46));
        btnInsertarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertarEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        btnInsertarEmpleado.setText("INSERTAR");
        btnInsertarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarEmpleado.setBackground(new java.awt.Color(250, 204, 46));
        btnMostrarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMostrarEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        btnMostrarEmpleado.setText("MOSTRAR");
        btnMostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setBackground(new java.awt.Color(250, 204, 46));
        btnModificarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarEmpleado.setForeground(new java.awt.Color(59, 47, 47));
        btnModificarEmpleado.setText("MODIFICAR");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEliminar.setBackground(new java.awt.Color(250, 204, 46));
        btnModificarEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarEliminar.setForeground(new java.awt.Color(59, 47, 47));
        btnModificarEliminar.setText("ELIMINAR");
        btnModificarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEliminarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(250, 204, 46));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(59, 47, 47));
        jButton4.setText("BORRAR CAMPOS DE TEXTO");

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(59, 47, 47));
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR POR NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(59, 47, 47))); // NOI18N

        txtBuscarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBuscarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR POR ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(59, 47, 47))); // NOI18N
        txtBuscarEmpleado.setCaretColor(new java.awt.Color(0, 0, 0));

        btnBuscarObtener.setBackground(new java.awt.Color(250, 204, 46));
        btnBuscarObtener.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarObtener.setForeground(new java.awt.Color(59, 47, 47));
        btnBuscarObtener.setText("BUSCAR");
        btnBuscarObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarObtenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btnInsertarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMostrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarObtener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarObtener, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        jPanel6.setBackground(new java.awt.Color(59, 47, 47));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTROS DE EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jtablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jtablaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono", "Fecha nc", "Genero", "Fecha ingreso", "Contrato", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jtablaEmpleado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab2", panelEmpleado);

        javax.swing.GroupLayout panelInfoVentasLayout = new javax.swing.GroupLayout(panelInfoVentas);
        panelInfoVentas.setLayout(panelInfoVentasLayout);
        panelInfoVentasLayout.setHorizontalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1535, Short.MAX_VALUE)
        );
        panelInfoVentasLayout.setVerticalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab3", panelInfoVentas);

        panelInfoProductos.setBackground(new java.awt.Color(243, 229, 215));

        jPanel10.setBackground(new java.awt.Color(59, 47, 47));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(243, 229, 215));
        jLabel24.setText("ID");

        jTextField6.setBackground(new java.awt.Color(243, 229, 215));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 229, 215));
        jLabel14.setText("Categoria");

        jComboBox1.setBackground(new java.awt.Color(243, 229, 215));
        jComboBox1.setForeground(new java.awt.Color(59, 47, 47));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 229, 215));
        jLabel15.setText("Nombre");

        jTextField8.setBackground(new java.awt.Color(243, 229, 215));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(243, 229, 215));
        jLabel19.setText("Precio");

        jTextField9.setBackground(new java.awt.Color(243, 229, 215));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(243, 229, 215));
        jLabel23.setText("Cantidad");

        jTextField10.setBackground(new java.awt.Color(243, 229, 215));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(243, 229, 215));
        jLabel27.setText("Ingredientes");

        jComboBox2.setBackground(new java.awt.Color(243, 229, 215));
        jComboBox2.setForeground(new java.awt.Color(59, 47, 47));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(243, 229, 215));
        jLabel25.setText("Descripcion");

        jTextArea1.setBackground(new java.awt.Color(243, 229, 215));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel47.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(250, 204, 46));
        jLabel47.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel25)
                        .addComponent(jLabel27)
                        .addComponent(jLabel23)
                        .addComponent(jLabel19)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(jLabel24)
                        .addComponent(jTextField10)
                        .addComponent(jComboBox2, 0, 243, Short.MAX_VALUE)
                        .addComponent(jTextField9)
                        .addComponent(jTextField8)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(59, 47, 47));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jButton5.setBackground(new java.awt.Color(250, 204, 46));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(59, 47, 47));
        jButton5.setText("BORRAR CAMPOS DE TEXTO");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );

        jPanel17.setBackground(new java.awt.Color(59, 47, 47));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTRO DE PRODUTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jTable3.setBackground(new java.awt.Color(243, 229, 215));
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoProductosLayout = new javax.swing.GroupLayout(panelInfoProductos);
        panelInfoProductos.setLayout(panelInfoProductosLayout);
        panelInfoProductosLayout.setHorizontalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProductosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        panelInfoProductosLayout.setVerticalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProductosLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProductosLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProductosLayout.createSequentialGroup()
                        .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        Jtabbed.addTab("tab4", panelInfoProductos);

        panelCategoria.setBackground(new java.awt.Color(243, 229, 215));

        jPanel18.setBackground(new java.awt.Color(59, 47, 47));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel48.setText("IDC");

        idc.setBackground(new java.awt.Color(243, 229, 215));
        idc.setForeground(new java.awt.Color(59, 47, 47));

        jLabel49.setText("NOMBREC");

        nombrec.setBackground(new java.awt.Color(243, 229, 215));
        nombrec.setForeground(new java.awt.Color(59, 47, 47));

        jLabel50.setText("DESCRIPCIÓN");

        descripcion.setBackground(new java.awt.Color(243, 229, 215));
        descripcion.setColumns(20);
        descripcion.setForeground(new java.awt.Color(59, 47, 47));
        descripcion.setRows(5);
        jScrollPane7.setViewportView(descripcion);

        jLabel52.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(250, 204, 46));
        jLabel52.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idc)
                                .addComponent(jLabel49)
                                .addComponent(nombrec, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                            .addComponent(jLabel50)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel51))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(59, 47, 47));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA D REGSITRO DE CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IDC", "NOMBRE", "DESCRIPCION"
            }
        ));
        jScrollPane8.setViewportView(tabla);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(59, 47, 47));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        agregar.setBackground(new java.awt.Color(250, 204, 46));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(59, 47, 47));
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(250, 204, 46));
        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(59, 47, 47));
        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(250, 204, 46));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(59, 47, 47));
        buscar.setText("BUSCAR");

        actualizar.setBackground(new java.awt.Color(250, 204, 46));
        actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(59, 47, 47));
        actualizar.setText("ACTUALIZAR");

        borrar.setBackground(new java.awt.Color(250, 204, 46));
        borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(59, 47, 47));
        borrar.setText("BORRAR");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab6", panelCategoria);

        panelUsusario.setBackground(new java.awt.Color(243, 229, 215));

        javax.swing.GroupLayout panelUsusarioLayout = new javax.swing.GroupLayout(panelUsusario);
        panelUsusario.setLayout(panelUsusarioLayout);
        panelUsusarioLayout.setHorizontalGroup(
            panelUsusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1535, Short.MAX_VALUE)
        );
        panelUsusarioLayout.setVerticalGroup(
            panelUsusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab7", panelUsusario);

        getContentPane().add(Jtabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelMenu.setVisible(!panelMenu.isVisible());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void panelMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelMenuAncestorAdded

    }//GEN-LAST:event_panelMenuAncestorAdded

    private void JtabbedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtabbedMouseClicked

    }//GEN-LAST:event_JtabbedMouseClicked

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar2ActionPerformed
        
    }//GEN-LAST:event_btnMostrar2ActionPerformed

    private void btnInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar2ActionPerformed
        
        String Scedula = txtCedulaEmpleado.getText();
        String nombre = txtNombreEmpleado.getText();
        String apellido = txtApellidoEmpleado.getText();
        String correo = txtCorreoEmpleado.getText();
        String telefono = txtTelefonoEmpleado.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoEmpleado.getDate();
        String genero = cbGeneroEmpleado.getSelectedItem().toString();
        java.util.Date fechIngreso = jdcFechaNacimientoEmpleado.getDate();
        String contrato = cbContratoEmpleado.getSelectedItem().toString();
        String jornada = cbJornadaEmpleado.getSelectedItem().toString();
        
        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null || fechIngreso == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date fechaIngresoSQL = new java.sql.Date(fechIngreso.getTime());
        
        long cedula = Long.parseLong(Scedula);

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);
        
        empleado e = new empleado();
        
        e.setCedulaUsuario(cedula);
        e.setFechaIngreso(fechaIngresoSQL);
        e.setTipoContrato(contrato);
        e.setTurnoTrabajo(jornada);
        
        usuarioDAO uDao = new usuarioDAO();
        empleadoDAO eDao = new empleadoDAO();
        
        if(uDao.crear(u)){
            if(eDao.crear(e))JOptionPane.showMessageDialog(this, "Empleado registrado");
        }
        
    }//GEN-LAST:event_btnInsertar2ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String Sid = txtBuscarCliente.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        long id = Long.parseLong(Sid);

        clienteDAO cDao = new clienteDAO();

        cliente c = cDao.obtener(id);

        if(cDao.buscar(id)){
            if(c != null){
                txtCedulaCliente.setText(String.valueOf(c.getCedulaUsuario()));
                txtNombreCliente.setText(c.getNombreUsuario());
                txtApellidoCliente.setText(c.getApellidoUsuario());
                txtCorreoCliente.setText(c.getCorreoUsuario());
                txtTelefonoCliente.setText(c.getTelefonoUsuario());
                jdcFechaNacimientoCliente.setDate(c.getFechaNacimiento());
                cbGeneroCliente.setSelectedItem(c.getGenero());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String Sid = txtBuscarCliente.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        String Scedula = txtCedulaCliente.getText();
        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String correo = txtCorreoCliente.getText();
        String telefono = txtTelefonoCliente.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoCliente.getDate();
        String genero = cbGeneroCliente.getSelectedItem().toString();

        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }

        long cedula = Long.parseLong(Scedula);

        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);

        usuarioDAO uDao = new usuarioDAO();

        if(uDao.modificar(u))JOptionPane.showMessageDialog(this, "Cambios realizados");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String Sid = txtBuscarCliente.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        long id = Long.parseLong(Sid);

        usuarioDAO uDao = new usuarioDAO();

        if(uDao.eliminar(id))JOptionPane.showMessageDialog(this, "Cliente eliminado con exito");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        llenarTabla.llenarTablaCliente(jtablaCliente);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        String Scedula = txtCedulaCliente.getText();
        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String correo = txtCorreoCliente.getText();
        String telefono = txtTelefonoCliente.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoCliente.getDate();
        String genero = cbGeneroCliente.getSelectedItem().toString();

        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }

        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());

        long cedula = Long.parseLong(Scedula);

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);

        //hola
        
        cliente c = new cliente();
        c.setCedulaUsuario(cedula);

        usuarioDAO uDao = new usuarioDAO();
        clienteDAO cDao = new clienteDAO();

        if (uDao.crear(u)) {
            if (cDao.crear(c)) {
                JOptionPane.showMessageDialog(this, "Cliente registrado con éxito");
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void cbContratoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContratoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContratoEmpleadoActionPerformed

    private void btnCrearIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearIngredienteActionPerformed

    private void agregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarIngredienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
      
        
        
        
    }//GEN-LAST:event_agregarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarActionPerformed

    private void btnInsertarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarClienteActionPerformed
        
        String Scedula = txtCedulaCliente.getText();
        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String correo = txtCorreoCliente.getText();
        String telefono = txtTelefonoCliente.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoCliente.getDate();
        String genero = cbGeneroCliente.getSelectedItem().toString();
        
        if(Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || fechaNacimiento == null){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }
        
        if(!validarCorreo.validarCorreo(correo)){
            JOptionPane.showMessageDialog(this, "Correo no valido");
        }
        
        long cedula = Long.parseLong(Scedula);
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        
        String hPassword = hashPassword.hashPassword(Scedula);
        
        cliente c = new cliente(cedula, nombre, apellido, correo, hPassword, telefono, "cliente", fechaNacimientoSQL, genero);
        
        if(uDao.crear(c)){
            if(cDao.crear(c)){
                JOptionPane.showMessageDialog(this, "Registro realizado");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo registrar el cliente");
            }
        }
        
    }//GEN-LAST:event_btnInsertarClienteActionPerformed

    private void lblInicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblInicioAncestorAdded
        
    }//GEN-LAST:event_lblInicioAncestorAdded

    private void lblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseClicked
        Jtabbed.setSelectedIndex(1);
    }//GEN-LAST:event_lblClienteMouseClicked

    private void lblInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblInicioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInicioKeyPressed

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        Jtabbed.setSelectedIndex(0);
    }//GEN-LAST:event_lblInicioMouseClicked

    private void btnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClienteActionPerformed
          llenarTabla.llenarTablaCliente(jtablaCliente);
    }//GEN-LAST:event_btnMostrarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        
        String Sid = txtBuscarCliente.getText();
        
        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula para obtener los datos del cliente");
            return;
        }
        
        String Scedula = txtCedulaCliente.getText();
        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String correo = txtCorreoCliente.getText();
        String telefono = txtTelefonoCliente.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoCliente.getDate();
        String genero = cbGeneroCliente.getSelectedItem().toString();
        
        if(Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || fechaNacimiento == null){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }
        
        if(!validarCorreo.validarCorreo(correo)){
            JOptionPane.showMessageDialog(this, "Correo no valido");
        }
        
        long cedula = Long.parseLong(Scedula);

        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        
        String hPassword = hashPassword.hashPassword(Scedula);
        
        cliente c = new cliente(cedula, nombre, apellido, correo, hPassword, telefono, "cliente", fechaNacimientoSQL, genero);
        
        if(uDao.modificar(c)){
            JOptionPane.showMessageDialog(this, "Se modifico con exito");
            llenarTabla.llenarTablaCliente(jtablaCliente);
        }else{
            JOptionPane.showMessageDialog(this, "No se pudieron realizar los cambios");
        }
        
        
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
        String Sid = txtBuscarCliente.getText();
        
        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula para obtener los datos del cliente");
            return;
        }
        
        long id = Long.parseLong(Sid);
        
        cliente c = cDao.obtener(id);
        
        txtCedulaCliente.setText(String.valueOf(c.getCedulaUsuario()));
        txtNombreCliente.setText(c.getNombreUsuario());
        txtApellidoCliente.setText(c.getApellidoUsuario());
        txtCorreoCliente.setText(c.getCorreoUsuario());
        txtTelefonoCliente.setText(c.getTelefonoUsuario());
        java.util.Date fecha = c.getFechaNacimiento();
        jdcFechaIngresoEmpleado.setDate(fecha);
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        String Sid = txtBuscarCliente.getText();
        
        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula para obtener los datos del cliente");
            return;
        }
        
        long id = Long.parseLong(Sid);
        
        if(cDao.eliminar(id)){
            JOptionPane.showMessageDialog(this, "Cliente eliminado con exito");
            llenarTabla.llenarTablaCliente(jtablaCliente);
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo eliminar al cliente");
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtCedulaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)txtNombreCliente.requestFocus();
    }//GEN-LAST:event_txtCedulaClienteKeyPressed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)txtApellidoCliente.requestFocus();
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void txtApellidoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)txtTelefonoCliente.requestFocus();
    }//GEN-LAST:event_txtApellidoClienteKeyPressed

    private void txtTelefonoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)txtCorreoCliente.requestFocus();
    }//GEN-LAST:event_txtTelefonoClienteKeyPressed

    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        v.validarSoloNumeros(evt);
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        v.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyTyped
        v.validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidoClienteKeyTyped

    private void lblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadoMouseClicked
        Jtabbed.setSelectedIndex(2);
    }//GEN-LAST:event_lblEmpleadoMouseClicked

    private void btnInsertarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEmpleadoActionPerformed
        
        String Scedula = txtCedulaEmpleado.getText();
        String nombre = txtNombreEmpleado.getText();
        String apellido = txtApellidoEmpleado.getText();
        String correo = txtCorreoEmpleado.getText();
        String telefono = txtTelefonoEmpleado.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoEmpleado.getDate();
        String genero = cbGeneroEmpleado.getSelectedItem().toString();
        String contrato = cbContratoEmpleado.getSelectedItem().toString();
        java.util.Date fechaIngreso = jdcFechaIngresoEmpleado.getDate();
        String jornada = cbJornadaEmpleado.getSelectedItem().toString();
        
        if(Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || fechaNacimiento == null || fechaIngreso == null){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de registrar");
            return;
        }
        
        if(!validarCorreo.validarCorreo(correo)){
            JOptionPane.showMessageDialog(this, "Ingrese un correo valido");
            return;
        }
        
        long cedula = Long.parseLong(Scedula);
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date fechaIngresoSQL = new java.sql.Date(fechaIngreso.getTime());
        
        String psHash = hashPassword.hashPassword(String.valueOf(cedula));
        
        empleado e = new empleado(fechaIngresoSQL, contrato, jornada, cedula, nombre, apellido, correo, psHash, telefono, "empleado", fechaNacimientoSQL, genero);
        
        if(uDao.crear(e)){
            if(eDao.crear(e)){
                JOptionPane.showMessageDialog(this, "Empleado registrado con exito");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo registrar al empleado");
            }
        }
        
    }//GEN-LAST:event_btnInsertarEmpleadoActionPerformed

    private void btnMostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadoActionPerformed
       LlenarTablas llenarTablas = new LlenarTablas();
       llenarTablas.llenarTablaEmpleado(jtablaEmpleado);
    }//GEN-LAST:event_btnMostrarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        
        String Sid = txtBuscarEmpleado.getText();
        
        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de modificar");
            return;
        }
        
        String Scedula = txtCedulaEmpleado.getText();
        String nombre = txtNombreEmpleado.getText();
        String apellido = txtApellidoEmpleado.getText();
        String correo = txtCorreoEmpleado.getText();
        String telefono = txtTelefonoEmpleado.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimientoEmpleado.getDate();
        String genero = cbGeneroEmpleado.getSelectedItem().toString();
        String contrato = cbContratoEmpleado.getSelectedItem().toString();
        java.util.Date fechaIngreso = jdcFechaIngresoEmpleado.getDate();
        String jornada = cbJornadaEmpleado.getSelectedItem().toString();
        
        if(Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
                || telefono.isEmpty() || fechaNacimiento == null || fechaIngreso == null){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de registrar");
            return;
        }
        
        if(validarCorreo.validarCorreo(correo)){
            JOptionPane.showMessageDialog(this, "Ingrese un correo valido");
            return;
        }
        
        long cedula = Long.parseLong(Scedula);
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date fechaIngresoSQL = new java.sql.Date(fechaIngreso.getTime());
        
        String psHash = hashPassword.hashPassword(String.valueOf(cedula));
        
        long id = Long.parseLong(Sid);
        
        empleado e = new empleado(fechaIngresoSQL, contrato, jornada, cedula, nombre, apellido, correo, psHash, telefono, "empleado", fechaNacimientoSQL, genero);
        
        if(uDao.modificar(e)){
            JOptionPane.showMessageDialog(this, "Se realizaron los cambios con exito");
            llenarTabla.llenarTablaCliente(jtablaEmpleado);
        }
        
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void btnModificarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEliminarActionPerformed
        
        String Sid = txtBuscarEmpleado.getText();

        if (Sid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de modificar");
            return;
        }
        
        long id = Long.parseLong(Sid);
        
        if(uDao.eliminar(id)){
            JOptionPane.showMessageDialog(this, "Empleado eliminado con exito");
            llenarTabla.llenarTablaEmpleado(jtablaEmpleado);
        }
        
    }//GEN-LAST:event_btnModificarEliminarActionPerformed

    private void btnBuscarObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarObtenerActionPerformed
        
        String Sid = txtBuscarEmpleado.getText();
        
        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de eliminar");
            return;
        }
        
        long id = Long.parseLong(Sid);
        
        empleado e = eDao.obtener(id);
        
        if(e != null){
            txtCedulaEmpleado.setText(String.valueOf(e.getCedulaUsuario()));
            txtNombreEmpleado.setText(e.getNombreUsuario());
            txtApellidoEmpleado.setText(e.getApellidoUsuario());
            txtCorreoEmpleado.setText(e.getCorreoUsuario());
            txtTelefonoEmpleado.setText(e.getTelefonoUsuario());
            jdcFechaNacimientoEmpleado.setDate(e.getFechaNacimiento());
            jdcFechaIngresoEmpleado.setDate(e.getFechaIngreso());
        }
        
    }//GEN-LAST:event_btnBuscarObtenerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Jtabbed;
    private javax.swing.JTable JtablaClienteInicio;
    private javax.swing.JTable JtablaProductos;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarObtener;
    private javax.swing.JButton btnInsertarCliente;
    private javax.swing.JButton btnInsertarEmpleado;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarEliminar;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnMostrarCliente;
    private javax.swing.JButton btnMostrarEmpleado;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cbContratoEmpleado;
    private javax.swing.JComboBox<String> cbGeneroCliente;
    private javax.swing.JComboBox<String> cbGeneroEmpleado;
    private javax.swing.JComboBox<String> cbJornadaEmpleado;
    private javax.swing.JLabel contClientes;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField idc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.toedter.calendar.JDateChooser jdcFechaIngresoEmpleado;
    private com.toedter.calendar.JDateChooser jdcFechaNacimientoCliente;
    private com.toedter.calendar.JDateChooser jdcFechaNacimientoEmpleado;
    private javax.swing.JTable jtablaCliente;
    private javax.swing.JTable jtablaEmpleado;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombrec;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelInfoClientes;
    private javax.swing.JPanel panelInfoIncio;
    private javax.swing.JPanel panelInfoProductos;
    private javax.swing.JPanel panelInfoVentas;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelUsusario;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarEmpleado;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaEmpleado;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
