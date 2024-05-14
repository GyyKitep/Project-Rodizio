import { FormControl, InputLabel, MenuItem, Select, TextField } from "@mui/material";
import React from "react";

export default function Combobox() {
    return (
        <>
            <FormControl variant="filled" sx={{marginTop:"5px",width: "200px", background:"rgb(255,250,250)" }}>
                <InputLabel id="demo-simple-select-filled-label">Categoria</InputLabel>
                <Select
                    labelId="demo-simple-select-filled-label"
                    id="demo-simple-select-filled"
                >

                    <MenuItem value="">Todas as Categorais</MenuItem>
                    <MenuItem value={2}>Categoria1</MenuItem>
                    <MenuItem value={3}>Categoria2</MenuItem>
                    <MenuItem value={4}>Categoria3</MenuItem>
                </Select>
            </FormControl>
        </>


    )
}