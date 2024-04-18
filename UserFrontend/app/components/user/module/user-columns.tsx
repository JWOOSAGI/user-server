import { Link, Typography } from "@mui/material";
import { GridColDef } from "@mui/x-data-grid";
import { UserColumn } from "../model/user-column";
import { PG } from "../../common/enums/PG";


interface CellType{
    row : UserColumn
}


export default function UserColumns(): GridColDef[]{

    return [
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'id',
            headerName: 'No.',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.id}</Typography>
            }
        ,
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'username',
            headerName: '아이디',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>
            <Link href={`${PG.USER}/detail/${row.id}`} className="underline" > {row.username} </Link>
            </Typography>
        },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'password',
            headerName: '비밀번호',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.password}</Typography>
        },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'name',
            headerName: '이름',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.name}</Typography>
        },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'phone',
            headerName: '전화번호',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.phone}</Typography>
        },
        {
            flex: 0.04,
            minWidth: 30,
            sortable: false,
            field: 'job',
            headerName: '직업',
            renderCell: ({row}:CellType) =>  <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.job}</Typography>
        },
    ]

}