import { configureStore } from "@reduxjs/toolkit";
import userReducer from "./features/userSlice";

// Configuración del store
export const store = configureStore({
  reducer: {
    user: userReducer,
  },
});

// Inferir tipos de `RootState` y `AppDispatch`
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;
