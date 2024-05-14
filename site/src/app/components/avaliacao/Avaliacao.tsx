import { Rating, Typography } from "@mui/material";
import React from "react";

export default function Avaliacao() {
    return (
        <>
            <Typography component="legend">Avaliação</Typography>
            <Rating
                name="simple-controlled"
                size="large"
                style={{marginLeft: "10px" }}
            />
        </>


    )
}