import Cabecalho from "@/app/components/cabecalho/Cabecalho";
import Galeria from "@/app/components/galeria/Galeria";
import { BrowseGallery } from "@mui/icons-material";
import { Paper } from "@mui/material";

export default function Home() {
    return (
        <>
            <Cabecalho />
            <Paper
                sx={{
                    p: 6,
                    background: '#737373',
                    height: '100%',
                    margin: '1rem 10rem',
                    borderRadius: 2,
                }}
            >

           <Galeria/>


            </Paper>
        </>
    )
}