pragma Warnings (Off);
pragma Ada_95;
pragma Source_File_Name (ada_main, Spec_File_Name => "b__main.ads");
pragma Source_File_Name (ada_main, Body_File_Name => "b__main.adb");
pragma Suppress (Overflow_Check);
with Ada.Exceptions;

package body ada_main is

   E073 : Short_Integer; pragma Import (Ada, E073, "system__os_lib_E");
   E014 : Short_Integer; pragma Import (Ada, E014, "system__soft_links_E");
   E026 : Short_Integer; pragma Import (Ada, E026, "system__exception_table_E");
   E069 : Short_Integer; pragma Import (Ada, E069, "ada__io_exceptions_E");
   E053 : Short_Integer; pragma Import (Ada, E053, "ada__strings_E");
   E041 : Short_Integer; pragma Import (Ada, E041, "ada__containers_E");
   E028 : Short_Integer; pragma Import (Ada, E028, "system__exceptions_E");
   E079 : Short_Integer; pragma Import (Ada, E079, "interfaces__c_E");
   E055 : Short_Integer; pragma Import (Ada, E055, "ada__strings__maps_E");
   E059 : Short_Integer; pragma Import (Ada, E059, "ada__strings__maps__constants_E");
   E022 : Short_Integer; pragma Import (Ada, E022, "system__soft_links__initialize_E");
   E081 : Short_Integer; pragma Import (Ada, E081, "system__object_reader_E");
   E048 : Short_Integer; pragma Import (Ada, E048, "system__dwarf_lines_E");
   E040 : Short_Integer; pragma Import (Ada, E040, "system__traceback__symbolic_E");
   E104 : Short_Integer; pragma Import (Ada, E104, "ada__tags_E");
   E102 : Short_Integer; pragma Import (Ada, E102, "ada__streams_E");
   E116 : Short_Integer; pragma Import (Ada, E116, "system__file_control_block_E");
   E115 : Short_Integer; pragma Import (Ada, E115, "system__finalization_root_E");
   E113 : Short_Integer; pragma Import (Ada, E113, "ada__finalization_E");
   E112 : Short_Integer; pragma Import (Ada, E112, "system__file_io_E");
   E100 : Short_Integer; pragma Import (Ada, E100, "ada__text_io_E");

   Sec_Default_Sized_Stacks : array (1 .. 1) of aliased System.Secondary_Stack.SS_Stack (System.Parameters.Runtime_Default_Sec_Stack_Size);

   Local_Priority_Specific_Dispatching : constant String := "";
   Local_Interrupt_States : constant String := "";

   Is_Elaborated : Boolean := False;

   procedure finalize_library is
   begin
      E100 := E100 - 1;
      declare
         procedure F1;
         pragma Import (Ada, F1, "ada__text_io__finalize_spec");
      begin
         F1;
      end;
      declare
         procedure F2;
         pragma Import (Ada, F2, "system__file_io__finalize_body");
      begin
         E112 := E112 - 1;
         F2;
      end;
      declare
         procedure Reraise_Library_Exception_If_Any;
            pragma Import (Ada, Reraise_Library_Exception_If_Any, "__gnat_reraise_library_exception_if_any");
      begin
         Reraise_Library_Exception_If_Any;
      end;
   end finalize_library;

   procedure adafinal is
      procedure s_stalib_adafinal;
      pragma Import (C, s_stalib_adafinal, "system__standard_library__adafinal");

      procedure Runtime_Finalize;
      pragma Import (C, Runtime_Finalize, "__gnat_runtime_finalize");

   begin
      if not Is_Elaborated then
         return;
      end if;
      Is_Elaborated := False;
      Runtime_Finalize;
      s_stalib_adafinal;
   end adafinal;

   type No_Param_Proc is access procedure;

   procedure adainit is
      Main_Priority : Integer;
      pragma Import (C, Main_Priority, "__gl_main_priority");
      Time_Slice_Value : Integer;
      pragma Import (C, Time_Slice_Value, "__gl_time_slice_val");
      WC_Encoding : Character;
      pragma Import (C, WC_Encoding, "__gl_wc_encoding");
      Locking_Policy : Character;
      pragma Import (C, Locking_Policy, "__gl_locking_policy");
      Queuing_Policy : Character;
      pragma Import (C, Queuing_Policy, "__gl_queuing_policy");
      Task_Dispatching_Policy : Character;
      pragma Import (C, Task_Dispatching_Policy, "__gl_task_dispatching_policy");
      Priority_Specific_Dispatching : System.Address;
      pragma Import (C, Priority_Specific_Dispatching, "__gl_priority_specific_dispatching");
      Num_Specific_Dispatching : Integer;
      pragma Import (C, Num_Specific_Dispatching, "__gl_num_specific_dispatching");
      Main_CPU : Integer;
      pragma Import (C, Main_CPU, "__gl_main_cpu");
      Interrupt_States : System.Address;
      pragma Import (C, Interrupt_States, "__gl_interrupt_states");
      Num_Interrupt_States : Integer;
      pragma Import (C, Num_Interrupt_States, "__gl_num_interrupt_states");
      Unreserve_All_Interrupts : Integer;
      pragma Import (C, Unreserve_All_Interrupts, "__gl_unreserve_all_interrupts");
      Detect_Blocking : Integer;
      pragma Import (C, Detect_Blocking, "__gl_detect_blocking");
      Default_Stack_Size : Integer;
      pragma Import (C, Default_Stack_Size, "__gl_default_stack_size");
      Default_Secondary_Stack_Size : System.Parameters.Size_Type;
      pragma Import (C, Default_Secondary_Stack_Size, "__gnat_default_ss_size");
      Leap_Seconds_Support : Integer;
      pragma Import (C, Leap_Seconds_Support, "__gl_leap_seconds_support");
      Bind_Env_Addr : System.Address;
      pragma Import (C, Bind_Env_Addr, "__gl_bind_env_addr");

      procedure Runtime_Initialize (Install_Handler : Integer);
      pragma Import (C, Runtime_Initialize, "__gnat_runtime_initialize");

      Finalize_Library_Objects : No_Param_Proc;
      pragma Import (C, Finalize_Library_Objects, "__gnat_finalize_library_objects");
      Binder_Sec_Stacks_Count : Natural;
      pragma Import (Ada, Binder_Sec_Stacks_Count, "__gnat_binder_ss_count");
      Default_Sized_SS_Pool : System.Address;
      pragma Import (Ada, Default_Sized_SS_Pool, "__gnat_default_ss_pool");

   begin
      if Is_Elaborated then
         return;
      end if;
      Is_Elaborated := True;
      Main_Priority := -1;
      Time_Slice_Value := -1;
      WC_Encoding := 'b';
      Locking_Policy := ' ';
      Queuing_Policy := ' ';
      Task_Dispatching_Policy := ' ';
      Priority_Specific_Dispatching :=
        Local_Priority_Specific_Dispatching'Address;
      Num_Specific_Dispatching := 0;
      Main_CPU := -1;
      Interrupt_States := Local_Interrupt_States'Address;
      Num_Interrupt_States := 0;
      Unreserve_All_Interrupts := 0;
      Detect_Blocking := 0;
      Default_Stack_Size := -1;
      Leap_Seconds_Support := 0;

      ada_main'Elab_Body;
      Default_Secondary_Stack_Size := System.Parameters.Runtime_Default_Sec_Stack_Size;
      Binder_Sec_Stacks_Count := 1;
      Default_Sized_SS_Pool := Sec_Default_Sized_Stacks'Address;

      Runtime_Initialize (1);

      Finalize_Library_Objects := finalize_library'access;

      System.Soft_Links'Elab_Spec;
      System.Exception_Table'Elab_Body;
      E026 := E026 + 1;
      Ada.Io_Exceptions'Elab_Spec;
      E069 := E069 + 1;
      Ada.Strings'Elab_Spec;
      E053 := E053 + 1;
      Ada.Containers'Elab_Spec;
      E041 := E041 + 1;
      System.Exceptions'Elab_Spec;
      E028 := E028 + 1;
      Interfaces.C'Elab_Spec;
      System.Os_Lib'Elab_Body;
      E073 := E073 + 1;
      Ada.Strings.Maps'Elab_Spec;
      Ada.Strings.Maps.Constants'Elab_Spec;
      E059 := E059 + 1;
      System.Soft_Links.Initialize'Elab_Body;
      E022 := E022 + 1;
      E014 := E014 + 1;
      System.Object_Reader'Elab_Spec;
      System.Dwarf_Lines'Elab_Spec;
      E048 := E048 + 1;
      E079 := E079 + 1;
      E055 := E055 + 1;
      System.Traceback.Symbolic'Elab_Body;
      E040 := E040 + 1;
      E081 := E081 + 1;
      Ada.Tags'Elab_Spec;
      Ada.Tags'Elab_Body;
      E104 := E104 + 1;
      Ada.Streams'Elab_Spec;
      E102 := E102 + 1;
      System.File_Control_Block'Elab_Spec;
      E116 := E116 + 1;
      System.Finalization_Root'Elab_Spec;
      E115 := E115 + 1;
      Ada.Finalization'Elab_Spec;
      E113 := E113 + 1;
      System.File_Io'Elab_Body;
      E112 := E112 + 1;
      Ada.Text_Io'Elab_Spec;
      Ada.Text_Io'Elab_Body;
      E100 := E100 + 1;
   end adainit;

   procedure Ada_Main_Program;
   pragma Import (Ada, Ada_Main_Program, "_ada_main");

   function main
     (argc : Integer;
      argv : System.Address;
      envp : System.Address)
      return Integer
   is
      procedure Initialize (Addr : System.Address);
      pragma Import (C, Initialize, "__gnat_initialize");

      procedure Finalize;
      pragma Import (C, Finalize, "__gnat_finalize");
      SEH : aliased array (1 .. 2) of Integer;

      Ensure_Reference : aliased System.Address := Ada_Main_Program_Name'Address;
      pragma Volatile (Ensure_Reference);

   begin
      gnat_argc := argc;
      gnat_argv := argv;
      gnat_envp := envp;

      Initialize (SEH'Address);
      adainit;
      Ada_Main_Program;
      adafinal;
      Finalize;
      return (gnat_exit_status);
   end;

--  BEGIN Object file/option list
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\bilbobus_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\bitarren_batuketa.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\bitarren_batuketa_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\bizkaibus_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\dezimaletik_hexadezimalera.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\dezimaletik_hexadezimalera_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\digitu_kopurua.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\hamartarretik_bitarrera.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\hamartarretik_bitarrera_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\kapikua_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\lehena_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\n_baino_handiagoa_den_lehena_eta_kapikua.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\n_baino_handiagoa_den_lehena_eta_kapikua_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\nazioartekoa_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\nazionala_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\regionala_da.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\autobus_mota.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\irteera_maiztasuna.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\hurrengo_autobusa.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\hurrengo_autobusa_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\trukatu.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\ordenatu_bi_zenbaki.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\ordenatu_hiru_zenbaki.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\ordenatu_hiru_zenbaki_proba.o
   --   C:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\main.o
   --   -LC:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\
   --   -LC:\Users\lucia\OneDrive\Escritorio\Uni\OP\lab_5\ada\obj\
   --   -LC:/gnat/2018/lib/gcc/x86_64-pc-mingw32/7.3.1/adalib/
   --   -static
   --   -lgnat
   --   -Wl,--stack=0x2000000
--  END Object file/option list   

end ada_main;
