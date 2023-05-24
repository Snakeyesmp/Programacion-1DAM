package Frontend;

import gestorclientes.Cliente;
import gestorclientes.GestorClientes;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Encarna Sánchez Gallego
 */
public class AppFrame extends javax.swing.JFrame
{

    /**
     * Creates new form AppFrame
     */
    public AppFrame()
    {
        initComponents();
        
        //Obtenemos el primer cliente.
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        Cliente actualCliente = iterator.next().getValue();
        
        currentPos = 1;
        //Mostramos el primer cliente.
        MostrarCliente(actualCliente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        DialogNuevo = new javax.swing.JDialog();
        NewLabelTittle = new javax.swing.JLabel();
        NewLabelNombre = new javax.swing.JLabel();
        NewInputNombre = new javax.swing.JTextField();
        NewLabelDirecc = new javax.swing.JLabel();
        NewInputDirecc = new javax.swing.JTextField();
        NewButtonAcept = new javax.swing.JButton();
        NewButtonCancel = new javax.swing.JButton();
        DialogEditar = new javax.swing.JDialog();
        EditLabelTittle = new javax.swing.JLabel();
        EditLabelNombre = new javax.swing.JLabel();
        EditInputNombre = new javax.swing.JTextField();
        EditLabelDirecc = new javax.swing.JLabel();
        EditInputDirecc = new javax.swing.JTextField();
        EditLabelID = new javax.swing.JLabel();
        EditLabelDataID = new javax.swing.JLabel();
        EditButtonAcept = new javax.swing.JButton();
        EditButtonCancel = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        ButtonPrimero = new javax.swing.JButton();
        ButtonAnterior = new javax.swing.JButton();
        ButtonSiguiente = new javax.swing.JButton();
        ButtonUltimo = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        LabelID = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelDirecc = new javax.swing.JLabel();
        DataID = new javax.swing.JLabel();
        DataNombre = new javax.swing.JLabel();
        DataDirecc = new javax.swing.JLabel();

        DialogNuevo.setTitle("Añadir Nuevo Cliente");
        DialogNuevo.setMaximumSize(new java.awt.Dimension(380, 250));
        DialogNuevo.setMinimumSize(new java.awt.Dimension(380, 250));
        DialogNuevo.setPreferredSize(new java.awt.Dimension(380, 250));
        DialogNuevo.setResizable(false);

        NewLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NewLabelTittle.setText("Nuevo Cliente");

        NewLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewLabelNombre.setText("Nombre:");

        NewLabelDirecc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewLabelDirecc.setText("Dirección:");

        NewButtonAcept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewButtonAcept.setText("Aceptar");
        NewButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewButtonAceptActionPerformed(evt);
            }
        });

        NewButtonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewButtonCancel.setText("Cancelar");
        NewButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogNuevoLayout = new javax.swing.GroupLayout(DialogNuevo.getContentPane());
        DialogNuevo.getContentPane().setLayout(DialogNuevoLayout);
        DialogNuevoLayout.setHorizontalGroup(
            DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogNuevoLayout.createSequentialGroup()
                .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogNuevoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(NewLabelTittle))
                    .addGroup(DialogNuevoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewLabelDirecc)
                            .addComponent(NewLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewInputDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DialogNuevoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(NewButtonAcept)
                        .addGap(18, 18, 18)
                        .addComponent(NewButtonCancel)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        DialogNuevoLayout.setVerticalGroup(
            DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewLabelTittle)
                .addGap(18, 18, 18)
                .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewLabelNombre)
                    .addComponent(NewInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewLabelDirecc)
                    .addComponent(NewInputDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(DialogNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewButtonAcept)
                    .addComponent(NewButtonCancel))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        DialogEditar.setTitle("Editar Cliente");
        DialogEditar.setMaximumSize(new java.awt.Dimension(400, 300));
        DialogEditar.setMinimumSize(new java.awt.Dimension(400, 300));
        DialogEditar.setResizable(false);

        EditLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EditLabelTittle.setText("Editar Cliente");

        EditLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditLabelNombre.setText("Nombre:");

        EditLabelDirecc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditLabelDirecc.setText("Dirección:");

        EditLabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditLabelID.setText("ID:");

        EditLabelDataID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditLabelDataID.setText("-1");

        EditButtonAcept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditButtonAcept.setText("Aceptar");
        EditButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditButtonAceptActionPerformed(evt);
            }
        });

        EditButtonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditButtonCancel.setText("Cancelar");
        EditButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogEditarLayout = new javax.swing.GroupLayout(DialogEditar.getContentPane());
        DialogEditar.getContentPane().setLayout(DialogEditarLayout);
        DialogEditarLayout.setHorizontalGroup(
            DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEditarLayout.createSequentialGroup()
                .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogEditarLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(EditLabelTittle))
                    .addGroup(DialogEditarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditLabelDirecc)
                            .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EditLabelID)
                                .addComponent(EditLabelNombre)))
                        .addGap(18, 18, 18)
                        .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditInputDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditLabelDataID)))
                    .addGroup(DialogEditarLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(EditButtonAcept)
                        .addGap(18, 18, 18)
                        .addComponent(EditButtonCancel)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        DialogEditarLayout.setVerticalGroup(
            DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditLabelTittle)
                .addGap(39, 39, 39)
                .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditLabelID)
                    .addComponent(EditLabelDataID))
                .addGap(18, 18, 18)
                .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditLabelNombre)
                    .addComponent(EditInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditLabelDirecc)
                    .addComponent(EditInputDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButtonAcept)
                    .addComponent(EditButtonCancel))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Clientes");
        setResizable(false);

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitleLabel.setText("Gestor de Clientes");

        ButtonPrimero.setText("|<");
        ButtonPrimero.setMaximumSize(new java.awt.Dimension(55, 24));
        ButtonPrimero.setMinimumSize(new java.awt.Dimension(55, 24));
        ButtonPrimero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonPrimeroActionPerformed(evt);
            }
        });

        ButtonAnterior.setText("<<");
        ButtonAnterior.setMaximumSize(new java.awt.Dimension(55, 24));
        ButtonAnterior.setMinimumSize(new java.awt.Dimension(55, 24));
        ButtonAnterior.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAnteriorActionPerformed(evt);
            }
        });

        ButtonSiguiente.setText(">>");
        ButtonSiguiente.setMaximumSize(new java.awt.Dimension(55, 24));
        ButtonSiguiente.setMinimumSize(new java.awt.Dimension(55, 24));
        ButtonSiguiente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSiguienteActionPerformed(evt);
            }
        });

        ButtonUltimo.setText(">|");
        ButtonUltimo.setMaximumSize(new java.awt.Dimension(55, 24));
        ButtonUltimo.setMinimumSize(new java.awt.Dimension(55, 24));
        ButtonUltimo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonUltimoActionPerformed(evt);
            }
        });

        ButtonNuevo.setText("NUEVO");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonNuevoActionPerformed(evt);
            }
        });

        ButtonModificar.setText("EDITAR");
        ButtonModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonModificarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonEliminarActionPerformed(evt);
            }
        });

        LabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelID.setText("ID:");

        LabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelName.setText("Nombre:");

        LabelDirecc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDirecc.setText("Dirección:");

        DataID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataID.setText("12345");

        DataNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataNombre.setText("Nombre");

        DataDirecc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataDirecc.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(TitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelID)
                            .addComponent(ButtonPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelName)
                            .addComponent(LabelDirecc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(ButtonNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonEliminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(DataID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(74, 74, 74))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DataNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DataDirecc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNuevo)
                    .addComponent(ButtonModificar)
                    .addComponent(ButtonEliminar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(DataID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(DataNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDirecc)
                    .addComponent(DataDirecc))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MostrarCliente(int id)
    {
        Cliente c = gc.getMapaClientes().get(id);
        
        MostrarCliente(c);
    }
    
    private void MostrarCliente(Cliente c)
    {
        DataID.setText(String.valueOf(c.id));
        DataNombre.setText(c.nombre);
        DataDirecc.setText(c.Direccion);
    }
    
    
    private void ButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonPrimeroActionPerformed
    {//GEN-HEADEREND:event_ButtonPrimeroActionPerformed
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        
        Cliente actualCliente = iterator.next().getValue();
        MostrarCliente(actualCliente);
        
        currentPos = 1;
    }//GEN-LAST:event_ButtonPrimeroActionPerformed

    private void ButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAnteriorActionPerformed
    {//GEN-HEADEREND:event_ButtonAnteriorActionPerformed
        Cliente c = null;
        //Probamos hasta dar con el siguiente.
        currentPos--;
        if(currentPos == 0)
        {
            System.out.println("No hay nada anterior...");
            currentPos = 1;
            return;
        }
        
        //Generamos el Iterador.
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        for(int i = 0; i < currentPos; i++)
        {
            //Iteramos el número de posiciones necesarias.
            c = iterator.next().getValue();
        }
        
        //Cuando lo encontremos, lo mostramos.
        MostrarCliente(c);
    }//GEN-LAST:event_ButtonAnteriorActionPerformed

    private void ButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSiguienteActionPerformed
    {//GEN-HEADEREND:event_ButtonSiguienteActionPerformed
        Cliente c = null;
        currentPos++;
        if(currentPos > gc.getMapaClientes().size())
        {
            System.out.println("Ese es el último...");
            currentPos--;
            return;
        }
        //Probamos hasta dar con el siguiente.
        //Generamos el Iterador.
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        for(int i = 0; i < currentPos; i++)
        {
            //Iteramos el número de posiciones necesarias.
            c = iterator.next().getValue();
        }
        
        //Cuando lo encontremos, lo mostramos.
        MostrarCliente(c);
    }//GEN-LAST:event_ButtonSiguienteActionPerformed

    private void ButtonUltimoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonUltimoActionPerformed
    {//GEN-HEADEREND:event_ButtonUltimoActionPerformed
        Cliente c = null;
        currentPos = gc.getMapaClientes().size();
        
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        for(int i = 0; i < currentPos; i++)
        {
            c = iterator.next().getValue();
        }
        
        MostrarCliente(c);
        
    }//GEN-LAST:event_ButtonUltimoActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonNuevoActionPerformed
    {//GEN-HEADEREND:event_ButtonNuevoActionPerformed
        DialogNuevo.setVisible(true);
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void NewButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewButtonCancelActionPerformed
    {//GEN-HEADEREND:event_NewButtonCancelActionPerformed
        //Lo hacemos invisible y limpiamos sus campos.
        DialogNuevo.setVisible(false);
        NewInputNombre.setText("");
        NewInputDirecc.setText("");
    }//GEN-LAST:event_NewButtonCancelActionPerformed

    private void NewButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewButtonAceptActionPerformed
    {//GEN-HEADEREND:event_NewButtonAceptActionPerformed
        //Obtenemos los datos.
        String nombre = "";
        String direcc = "";
        
        try
        {
            nombre = NewInputNombre.getText();
            direcc = NewInputDirecc.getText();
        } catch (Exception e)
        {
            System.err.println("No se han podido capturar los datos del nuevo cliente.");
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        gc.AddCliente(nombre, direcc);
        //Lo hacemos invisible y limpiamos sus campos.
        DialogNuevo.setVisible(false);
        NewInputNombre.setText("");
        NewInputDirecc.setText("");
    }//GEN-LAST:event_NewButtonAceptActionPerformed

    private void EditButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditButtonCancelActionPerformed
    {//GEN-HEADEREND:event_EditButtonCancelActionPerformed
        // Ocultamos y limpiamos.
        DialogEditar.setVisible(false);
        EditInputNombre.setText("");
        EditInputDirecc.setText("");
        EditLabelDataID.setText("-1");
    }//GEN-LAST:event_EditButtonCancelActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonModificarActionPerformed
    {//GEN-HEADEREND:event_ButtonModificarActionPerformed
        DialogEditar.setVisible(true);
        //Obtenemos los datos del cliente actual.
        Cliente c = null;
        Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
        for(int i = 0; i < currentPos; i++)
        {
            //Iteramos el número de posiciones necesarias.
            c = iterator.next().getValue();
        }
        
        EditLabelDataID.setText(String.valueOf(c.id));
        EditInputNombre.setText(c.nombre);
        EditInputDirecc.setText(c.Direccion);
    }//GEN-LAST:event_ButtonModificarActionPerformed

    private void EditButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditButtonAceptActionPerformed
    {//GEN-HEADEREND:event_EditButtonAceptActionPerformed
        //Obtenemos los nuevos datos.
        String nombre = "";
        String direcc = "";
        int id = -1;
        
        try
        {
            id = Integer.parseInt(EditLabelDataID.getText());
            nombre = EditInputNombre.getText();
            direcc = EditInputDirecc.getText();
        } catch (Exception e)
        {
            System.err.println("No se han podido capturar los datos del nuevo cliente.");
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        gc.ModificarCliente(id, nombre, direcc);
        MostrarCliente(id);
        
        // Ocultamos y limpiamos.
        DialogEditar.setVisible(false);
        EditInputNombre.setText("");
        EditInputDirecc.setText("");
        EditLabelDataID.setText("-1");
    }//GEN-LAST:event_EditButtonAceptActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonEliminarActionPerformed
    {//GEN-HEADEREND:event_ButtonEliminarActionPerformed
        
        int rs = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que quiere eliminar al cliente ID: " + DataID.getText(), "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if(rs == 0)
        {
            //Eliminamos.
            int id = Integer.parseInt(DataID.getText());
            gc.EliminarCliente(id);
            
            //Por seguridad, mostramos el primer cliente.
            Iterator<Map.Entry<Integer, Cliente>> iterator = gc.getMapaClientes().entrySet().iterator();
            Cliente actualCliente = iterator.next().getValue();

            currentPos = 1;
            //Mostramos el primer cliente.
            MostrarCliente(actualCliente);
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    
    
    /**
     * @param conn Referencia al sistema de DB.
     */
    public static void main(GestorClientes gc)
    {
        AppFrame.gc = gc;
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AppFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnterior;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JButton ButtonPrimero;
    private javax.swing.JButton ButtonSiguiente;
    private javax.swing.JButton ButtonUltimo;
    private javax.swing.JLabel DataDirecc;
    private javax.swing.JLabel DataID;
    private javax.swing.JLabel DataNombre;
    private javax.swing.JDialog DialogEditar;
    private javax.swing.JDialog DialogNuevo;
    private javax.swing.JButton EditButtonAcept;
    private javax.swing.JButton EditButtonCancel;
    private javax.swing.JTextField EditInputDirecc;
    private javax.swing.JTextField EditInputNombre;
    private javax.swing.JLabel EditLabelDataID;
    private javax.swing.JLabel EditLabelDirecc;
    private javax.swing.JLabel EditLabelID;
    private javax.swing.JLabel EditLabelNombre;
    private javax.swing.JLabel EditLabelTittle;
    private javax.swing.JLabel LabelDirecc;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelName;
    private javax.swing.JButton NewButtonAcept;
    private javax.swing.JButton NewButtonCancel;
    private javax.swing.JTextField NewInputDirecc;
    private javax.swing.JTextField NewInputNombre;
    private javax.swing.JLabel NewLabelDirecc;
    private javax.swing.JLabel NewLabelNombre;
    private javax.swing.JLabel NewLabelTittle;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables

    private static GestorClientes gc;
    
    private int currentPos;


}
