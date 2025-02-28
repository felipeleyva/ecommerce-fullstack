import { createSlice, PayloadAction } from "@reduxjs/toolkit";

// Definir el tipo para el estado del usuario
interface UserState {
  value: { name: string; email: string } | null;
}

// Estado inicial con el tipo definido
const initialState: UserState = {
  value: null,
};

// Crear el slice con Redux Toolkit
export const userSlice = createSlice({
  name: "user",
  initialState,
  reducers: {
    login: (state, action: PayloadAction<{ name: string; email: string }>) => {
      state.value = action.payload;
    },
    logout: (state) => {
      state.value = null;
    },
  },
});

// Exportar las acciones y el reducer
export const { login, logout } = userSlice.actions;
export default userSlice.reducer;
